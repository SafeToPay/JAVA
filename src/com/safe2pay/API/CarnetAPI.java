/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safe2pay.API;

import com.safe2pay.CORE.Client;
import com.safe2pay.DTO.Response.ResponseSafe2Pay;

/**
 *
 * @author lucas.silva
 */
public class CarnetAPI {

    public static ResponseSafe2Pay Get(String identifier) {

        ResponseSafe2Pay response = Client.HttpClient("GET", "v1/carnet/".concat(identifier), null, false);
        return response;
    }

    public static ResponseSafe2Pay CancelLot(String identifier) {

        ResponseSafe2Pay response = Client.HttpClient("DELETE", "v1/carnet/".concat(identifier), null, false);
        return response;
    }

    public static ResponseSafe2Pay Cancel(String identifier) {

        ResponseSafe2Pay response = Client.HttpClient("DELETE", "v1/carnet/".concat(identifier), null, false);
        return response;
    }
}
