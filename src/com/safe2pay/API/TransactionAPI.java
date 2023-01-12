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
public class TransactionAPI {

    public static ResponseSafe2Pay Get(int Id){

        ResponseSafe2Pay response = Client.HttpClient("GET", "v2/transaction/Get?Id=".concat(Integer.toString(Id)), null, false);
        return response;

    }

}
