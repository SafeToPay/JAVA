/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safe2pay.API;

import com.safe2pay.CORE.Client;
import com.safe2pay.DTO.Response.ResponseSafe2PayRecurrence;
import com.safe2pay.DTO.Subscription.Subscription;

import java.text.MessageFormat;

/**
 *
 * @author lucas.silva
 */
public class SubscriptionAPI {

    public static ResponseSafe2PayRecurrence Add(int Id, Subscription payload) {

        ResponseSafe2PayRecurrence response = Client.HttpClient("POST", MessageFormat.format("V1/Plans/{0}/Subscriptions", (Integer.toString(Id))), payload,false, "services");
        return response;
    }

    public static ResponseSafe2PayRecurrence Simulation(Subscription payload) {

        ResponseSafe2PayRecurrence response = Client.HttpClient("POST", "V1/Subscriptions/Simulate", payload, false, "services");
        return response;
    }

     public static ResponseSafe2PayRecurrence Get(int Id) {

         ResponseSafe2PayRecurrence response = Client.HttpClient("GET", "V1/Subscriptions/".concat(Integer.toString(Id)), null, false, "services");
        return response;
    }

     public static ResponseSafe2PayRecurrence List(int PageNumber, int RowsPage, String CustomerName, String Status, String InitialDate, String EndDate, int IdPlan) {

         ResponseSafe2PayRecurrence response = Client.HttpClient("GET", MessageFormat.format("V1/Subscriptions?PageNumber={0}&RowsPerPage={1}&CustomerName={2}&Status={3}&InitialDate={4}&EndDate={5}&IdPlan={6}", PageNumber,RowsPage, CustomerName, Status, InitialDate,EndDate, IdPlan), null, false,"services");
         return response;
    }

     public static ResponseSafe2PayRecurrence ListCharges(int Id) {

         ResponseSafe2PayRecurrence response = Client.HttpClient("GET", MessageFormat.format("V1/Subscriptions/{0}/Charges", (Integer.toString(Id))), null,  false, "services");
        return response;
    }

     public static ResponseSafe2PayRecurrence DisableSubscription(int Id) {


         ResponseSafe2PayRecurrence response = Client.httppatch("PATCH",  MessageFormat.format("V1/Subscriptions/{0}/Disable", (Integer.toString(Id))), null, false,"services");
        return response;
    }

     public static ResponseSafe2PayRecurrence UpdateToken(String token, int Id) {

         ResponseSafe2PayRecurrence response = Client.httppatch("PATCH", MessageFormat.format("V1/Subscriptions/{0}/UpdateTokenCard", (Integer.toString(Id))),token, false, "services");
        return response;
    }
     
}
