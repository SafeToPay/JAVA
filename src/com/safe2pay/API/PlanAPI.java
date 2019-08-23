/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safe2pay.API;

import com.safe2pay.CORE.Client;
import com.safe2pay.DTO.Plan.Plan;
import com.safe2pay.DTO.Response.ResponseSafe2Pay;
import java.text.MessageFormat;

/**
 *
 * @author lucas.silva
 */
public class PlanAPI {
    
    public static ResponseSafe2Pay Add(Plan plan) {

        ResponseSafe2Pay response = Client.HttpClient("POST", "v2/Plan/Add", plan, false);
        return response;
    }
    
    public static ResponseSafe2Pay Update(Plan plan) {

        ResponseSafe2Pay response = Client.HttpClient("PUT", "v2/Plan/Update", plan, false);
        return response;
    }

    public static ResponseSafe2Pay Get(int Id) {

        ResponseSafe2Pay response = Client.HttpClient("GET", "v2/Plan/Get?Id=".concat(Integer.toString(Id)), null, false);
        return response;
    }
    
      public static ResponseSafe2Pay List(int PageNumber,int Rowspage) {

        ResponseSafe2Pay response = Client.HttpClient("GET",  MessageFormat.format("v2/Plan/List?PageNumber={0}&RowsPerPage={1}", PageNumber,Rowspage), null, false);
        return response;
    }
       
}
