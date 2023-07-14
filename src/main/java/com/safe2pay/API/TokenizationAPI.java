/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safe2pay.API;

import com.safe2pay.CORE.Client;
import com.safe2pay.DTO.Payment.CreditCard;
import com.safe2pay.DTO.Response.ResponseSafe2Pay;

/**
 *
 * @author lucas.silva
 */
public class TokenizationAPI {
    
        public static ResponseSafe2Pay Create(CreditCard card){

        ResponseSafe2Pay response = Client.HttpClient("POST", "v2/token", card, true);
        return response;
    }

}
