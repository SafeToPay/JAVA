/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safe2pay.CORE;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.safe2pay.DTO.Response.ResponseSafe2Pay;
import com.safe2pay.DTO.Response.ResponseSafe2PayRecurrence;
import org.junit.runner.Request;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @author lucas.silva
 */
public final class Client {

    private static String apiKey = "";

    public static void SetEnviroment(String Token) {
        apiKey = Token;
    }

    private static String GetEnviroment() {
        return apiKey;
    }

    public static ResponseSafe2Pay HttpClient(String method, String endpoint, Object body, boolean IsPayment) {

        try {

            System.setProperty("https.protocols", "TLSv1.2");

            // Monta endpoint da requisição
            URL obj = new URL(GetBaseUrl(IsPayment).concat(endpoint));
            // Abre conexão com o endpoint
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            // Adiciona o WebMethod
            con.setRequestMethod(method);
            // Adiciona os Headers da requisição
            con.setRequestProperty("X-API-KEY", GetEnviroment());
            con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            con.setRequestProperty("Accept", "application/json");
            con.setDoOutput(true);
            con.setDoInput(true);

            // Adiciona o Body nas requisições
            if (method == "POST" || method == "PUT") {
                if (body != null) {
                    ObjectMapper mapper = new ObjectMapper();

                    mapper.setSerializationInclusion(Include.NON_NULL);
                    // mapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);

                    mapper.setVisibilityChecker(mapper.getSerializationConfig().getDefaultVisibilityChecker()
                            .withFieldVisibility(JsonAutoDetect.Visibility.ANY)
                            .withGetterVisibility(JsonAutoDetect.Visibility.NONE)
                            .withSetterVisibility(JsonAutoDetect.Visibility.NONE)
                            .withCreatorVisibility(JsonAutoDetect.Visibility.NONE));

                    String payload = mapper.writeValueAsString(body);

                    try (OutputStream os = con.getOutputStream()) {
                        byte[] input = payload.getBytes("utf-8");
                        os.write(input, 0, input.length);
                    }
                }
            }

            // Retorna o código de resposta
            int responseCode = con.getResponseCode();
            // Faz Leitura no buffer de resposta
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // return response
            return ResponseDeserialize(response.toString());

        } catch (Exception e) {

            System.err.println(e.getMessage());
        }
        return null;

    }

    public static ResponseSafe2PayRecurrence HttpClient(String method, String endpoint, Object body, boolean IsPayment,
            String serviceName) {

        try {

            System.setProperty("https.protocols", "TLSv1.2");

            // Monta endpoint da requisição
            URL obj = new URL(GetBaseUrl(IsPayment, serviceName).concat(endpoint));
            // Abre conexão com o endpoint
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            // Adiciona o WebMethod
            con.setRequestMethod(method);
            // Adiciona os Headers da requisição
            con.setRequestProperty("X-API-KEY", GetEnviroment());
            con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            con.setRequestProperty("Accept", "application/json");
            con.setDoOutput(true);
            con.setDoInput(true);

            // Adiciona o Body nas requisições
            if (method == "POST" || method == "PUT") {
                if (body != null) {
                    ObjectMapper mapper = new ObjectMapper();

                    mapper.setSerializationInclusion(Include.NON_NULL);
                    // mapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);

                    mapper.setVisibilityChecker(mapper.getSerializationConfig().getDefaultVisibilityChecker()
                            .withFieldVisibility(JsonAutoDetect.Visibility.ANY)
                            .withGetterVisibility(JsonAutoDetect.Visibility.NONE)
                            .withSetterVisibility(JsonAutoDetect.Visibility.NONE)
                            .withCreatorVisibility(JsonAutoDetect.Visibility.NONE));

                    String payload = mapper.writeValueAsString(body);
                    try (OutputStream os = con.getOutputStream()) {
                        byte[] input = payload.getBytes("utf-8");
                        os.write(input, 0, input.length);
                        // con.setRequestProperty("Content-Length", Integer.toString(input.length));
                    }
                }
            }

            // Retorna o código de resposta
            int responseCode = con.getResponseCode();
            // Faz Leitura no buffer de resposta
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // return response
            return ResponseDeserializeRecurrence(response.toString());

        } catch (Exception e) {

            System.err.println(e.getMessage());
        }
        return null;

    }

    private static String GetBaseUrl(boolean IsPayment) throws Exception {
        if (!IsPayment) {
            return "https://api.safe2pay.com.br/";
        } else {
            return "https://payment.safe2pay.com.br/";
        }
    }

    private static String GetBaseUrl(boolean IsPayment, String serviceName) throws Exception {
        if (serviceName == "") {
            if (!IsPayment) {
                return "https://api.safe2pay.com.br/";
            } else {
                return "https://payment.safe2pay.com.br/";
            }
        } else if (serviceName == "services") {
            return "https://services.safe2pay.com.br/Recurrence/";
        } else {
            throw new Exception("Informe o serivço que deseja");
        }
    }

    private static ResponseSafe2Pay ResponseDeserialize(String Json) throws IOException {

        ResponseSafe2Pay retorno = new ObjectMapper().readValue(Json, ResponseSafe2Pay.class);

        return retorno;
    }

    private static ResponseSafe2PayRecurrence ResponseDeserializeRecurrence(String Json) throws IOException {

        ResponseSafe2PayRecurrence retorno = new ObjectMapper().readValue(Json, ResponseSafe2PayRecurrence.class);

        return retorno;
    }

    private static ResponseSafe2PayRecurrence ResponseDeserializeRecurrence(HttpResponse response) throws IOException {

        ResponseSafe2PayRecurrence retorno = new ResponseSafe2PayRecurrence();
        if (response.statusCode() == 204) {
            retorno.success = true;
        }
        return retorno;
    }

    public static ResponseSafe2PayRecurrence httppatch(String method, String endpoint, Object body, boolean IsPayment,
            String serviceName) {
        try {

            System.setProperty("https.protocols", "TLSv1.2");
            // Adiciona o WebMethod

            // Adiciona os Headers da requisição
            HttpRequest request = HttpRequest.newBuilder()
                    .method("PATCH", HttpRequest.BodyPublishers.ofString(""))
                    .uri(URI.create(GetBaseUrl(IsPayment, serviceName).concat(endpoint)))
                    .header("Content-Type", "application/json; charset=UTF-8")
                    .header("Accept", "application/json")
                    .header("X-API-KEY", GetEnviroment())
                    .build();
            HttpResponse<String> response = HttpClient.newBuilder().build().send(request,
                    HttpResponse.BodyHandlers.ofString());

            return ResponseDeserializeRecurrence(response);
        } catch (Exception e) {

            System.err.println(e.getMessage());
        }
        return null;
    }

}
