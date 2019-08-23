/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safe2pay.API;

import com.safe2pay.CORE.Client;
import com.safe2pay.DTO.Response.ResponseSafe2Pay;
import com.safe2pay.DTO.Subscription.Subscription;

/**
 *
 * @author lucas.silva
 */
public class SubscriptionAPI {

    public static ResponseSafe2Pay Add(Subscription subscription) {

        ResponseSafe2Pay response = Client.HttpClient("POST", "v2/subscription", subscription, false);
        return response;
    }

    public static ResponseSafe2Pay Get(int Id) {

        ResponseSafe2Pay response = Client.HttpClient("GET", "v2/subscription/get?id=".concat(Integer.toString(Id)), null, false);
        return response;
    }
}
