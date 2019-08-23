/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safe2pay.API;

import com.safe2pay.CORE.Client;
import com.safe2pay.DTO.Payment.CarnetLot;
import com.safe2pay.DTO.Response.ResponseSafe2Pay;
import com.safe2pay.DTO.Transactions.Transaction;
import java.text.MessageFormat;

/**
 *
 * @author lucas.silva
 */
public class PaymentAPI {

    public static ResponseSafe2Pay GetPaymentMethods() {

        ResponseSafe2Pay response = Client.HttpClient("GET", "v2/MerchantPaymentMethod/List", null, false);
        return response;
    }

    public static ResponseSafe2Pay BankSlip(Transaction payload) {

          ResponseSafe2Pay response = Client.HttpClient("POST", "v2/Payment", payload, true);
        return response;
    }

    public static ResponseSafe2Pay CreditCard(Transaction payload) {

         ResponseSafe2Pay response = Client.HttpClient("POST", "v2/Payment", payload, true);
        return response;
    }

    public static ResponseSafe2Pay CryptoCurrency(Transaction payload) {

        ResponseSafe2Pay response = Client.HttpClient("POST", "v2/Payment", payload, true);
        return response;
    }

    public static ResponseSafe2Pay DebitCard(Transaction payload) {

        ResponseSafe2Pay response = Client.HttpClient("POST", "v2/Payment", payload, true);
        return response;
    }

    public static ResponseSafe2Pay Carnet(Transaction payload) {

        ResponseSafe2Pay response = Client.HttpClient("POST", "v2/Carnet", payload, true);
        return response;
    }

    public static ResponseSafe2Pay CarnetLot(CarnetLot payload) {

        ResponseSafe2Pay response = Client.HttpClient("POST", "v2/carnetasync/", payload, true);
        return response;
    }

    public static ResponseSafe2Pay DebitAccount(Transaction payload) {

        ResponseSafe2Pay response = Client.HttpClient("POST", "v2/payment", payload, true);
        return response;
    }

    public static ResponseSafe2Pay Refund(int Id) {

        ResponseSafe2Pay response = Client.HttpClient("DELETE", "v2/CreditCard/Cancel/" + Integer.toString(Id) , null, false);
        return response;
    }
}
