/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safe2pay.API;

import com.safe2pay.CORE.Client;
import com.safe2pay.DTO.Response.ResponseSafe2Pay;
import com.safe2pay.DTO.SingleSale.SingleSale;
import java.text.MessageFormat;

/**
 *
 * @author lucas.silva
 */
public class InvoiceAPI {
    
    public static ResponseSafe2Pay Get(String HashSale) {

        ResponseSafe2Pay response = Client.HttpClient("GET", "v2/SingleSale/Get?singleSaleHash=".concat(HashSale), null, false);
        return response;
    }

    public static ResponseSafe2Pay Update(SingleSale singleSale) {

        ResponseSafe2Pay response = Client.HttpClient("PUT", "v2/SingleSale/Update", singleSale, false);
        return response;
    }
    
     public static ResponseSafe2Pay Add(SingleSale singleSale) {

        ResponseSafe2Pay response = Client.HttpClient("POST", "v2/SingleSale/Add", singleSale, false);
        return response;
    }
     
      public static ResponseSafe2Pay List(int PageNumber,int Rowspage) {

        ResponseSafe2Pay response = Client.HttpClient("GET",  MessageFormat.format("v2/SingleSale/List?PageNumber={0}&RowsPerPage={1}", PageNumber,Rowspage), null, false);
        return response;
    }

    public static ResponseSafe2Pay Cancel(String HashSale) {

        ResponseSafe2Pay response = Client.HttpClient("DELETE", "v2/SingleSale/Delete?singleSaleHash=".concat(HashSale), null, false);
        return response;
    }

    public static ResponseSafe2Pay Resend(String HashSale) {

        ResponseSafe2Pay response = Client.HttpClient("GET", "v2/SingleSale/Resend?singleSaleHash=".concat(HashSale), null, false);
        return response;
    }
}
