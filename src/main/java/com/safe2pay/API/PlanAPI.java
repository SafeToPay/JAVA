/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safe2pay.API;

import com.safe2pay.CORE.Client;
import com.safe2pay.DTO.Plan.Plan;
import com.safe2pay.DTO.Response.ResponseSafe2PayRecurrence;

import java.text.MessageFormat;

/**
 *'''''
 * @author lucas.silva
 */
public class PlanAPI {


    public static ResponseSafe2PayRecurrence Add(Plan plan) {

        ResponseSafe2PayRecurrence response = Client.HttpClient("POST", "V1/Plans", plan, false, "services");
        return response;
    }

    public static ResponseSafe2PayRecurrence DisablePlan(int Id) {

        ResponseSafe2PayRecurrence response = Client.httppatch("PATCH", MessageFormat.format("V1/Plans/{0}/Disable", (Integer.toString(Id))),null, false,"services");
        return response;
    }

    public static ResponseSafe2PayRecurrence Get(int Id) {

        ResponseSafe2PayRecurrence response = Client.HttpClient("GET", "V1/Plans/".concat(Integer.toString(Id)), null, false,"services");
        return response;
    }
    
      public static ResponseSafe2PayRecurrence List(String Name, boolean IsEnabled, int PageNumber,int Rowspage) {

          ResponseSafe2PayRecurrence response = Client.HttpClient("GET",  MessageFormat.format("V1/Plans?Name={0}&IsEnabled={1}&PageNumber={2}&RowsPerPage={3}", Name, IsEnabled, PageNumber,Rowspage), null, false,"services");
        return response;
    }
       
}
