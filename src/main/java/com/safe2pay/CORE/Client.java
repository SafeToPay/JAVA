package com.safe2pay.CORE;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.safe2pay.DTO.Response.ResponseSafe2Pay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

public final class Client {

    private static String apiKey = "";

    public static void setToken(String token) {
        apiKey = token;
    }

    public static ResponseSafe2Pay makeCallToApi(String method, String endpoint, Object body, boolean IsPayment) {
        try {
            System.setProperty("https.protocols", "TLSv1.2");

            // Monta endpoint da requisição
            final HttpURLConnection con = getHttpURLConnection(method, endpoint, IsPayment);

            // Adiciona o Body nas requisições
            if (Objects.equals(method, "POST") || Objects.equals(method, "PUT")) {
                if (body != null) {
                    final ObjectMapper mapper = new ObjectMapper();

                    mapper.setSerializationInclusion(Include.NON_NULL);

                    mapper.setVisibility(mapper.getSerializationConfig().getDefaultVisibilityChecker()
                            .withFieldVisibility(JsonAutoDetect.Visibility.ANY)
                            .withGetterVisibility(JsonAutoDetect.Visibility.NONE)
                            .withSetterVisibility(JsonAutoDetect.Visibility.NONE)
                            .withCreatorVisibility(JsonAutoDetect.Visibility.NONE));

                    final String payload = mapper.writeValueAsString(body);

                    try (OutputStream os = con.getOutputStream()) {
                        byte[] input = payload.getBytes(StandardCharsets.UTF_8);
                        os.write(input, 0, input.length);
                    }
                }
            }

            // Faz Leitura no buffer de resposta
            final BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            final StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            return deserializeResponse(response.toString());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    private static HttpURLConnection getHttpURLConnection(String method, String endpoint, boolean IsPayment) throws IOException {
        final URL obj = new URL(getBaseUrl(IsPayment).concat(endpoint));
        // Abre conexão com o endpoint
        final HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        // Adiciona o WebMethod
        con.setRequestMethod(method);
        // Adiciona os Headers da requisição
        con.setRequestProperty("X-API-KEY", apiKey);
        con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        con.setRequestProperty("Accept", "application/json");
        con.setDoOutput(true);
        con.setDoInput(true);
        return con;
    }

    private static String getBaseUrl(boolean IsPayment) {
        return !IsPayment ? "https://api.safe2pay.com.br/" : "https://payment.safe2pay.com.br/";
    }

    private static ResponseSafe2Pay deserializeResponse(String Json) throws IOException {
        return new ObjectMapper().readValue(Json, ResponseSafe2Pay.class);
    }

}
