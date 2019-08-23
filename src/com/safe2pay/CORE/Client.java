/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safe2pay.CORE;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.safe2pay.DTO.Response.ResponseSafe2Pay;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
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

            System.setProperty("https.protocols", "TLSv1,TLSv1.1,TLSv1.2");

            //Monta endpoint da requisição
            URL obj = new URL(GetBaseUrl(IsPayment).concat(endpoint));
            //Abre conexão com o endpoint
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            //Adiciona o WebMethod
            con.setRequestMethod(method);
            //Adiciona os Headers da requisição
            con.setRequestProperty("X-API-KEY", GetEnviroment());
            con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            con.setRequestProperty("Accept", "application/json");
            con.setDoOutput(true);
            con.setDoInput(true);

            //Adiciona o Body nas requisições
            if (method == "POST" || method == "PUT") {
                if (body != null) {
                    ObjectMapper mapper = new ObjectMapper();

                    mapper.setSerializationInclusion(Include.NON_NULL);
                    //  mapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);

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

            //Retorna o código de resposta 
            int responseCode = con.getResponseCode();
            //Faz Leitura no buffer de resposta
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

         
            
            // return response
            return  ResponseDeserialize(response.toString());

        } catch (Exception e) {

            System.err.println(e.getMessage());
        }
        return null;

    }

    private static String GetBaseUrl(boolean IsPayment) {
        if (!IsPayment) {
            return "https://api.safe2pay.com.br/";
        } else {
            return "https://payment.safe2pay.com.br/";
        }
    }
    
    
    private static ResponseSafe2Pay ResponseDeserialize (String Json) throws IOException{
    
          ResponseSafe2Pay retorno = new ObjectMapper().readValue(Json, ResponseSafe2Pay.class);

          
          return retorno;
    }
}
