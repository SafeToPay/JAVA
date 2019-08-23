/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safe2pay.API;

import com.safe2pay.CORE.Client;
import com.safe2pay.DTO.Response.ResponseSafe2Pay;
import java.text.MessageFormat;

/**
 *
 * @author lucas.silva
 */
public class AccountDepositAPI {
    
      public static ResponseSafe2Pay GetBankAccount() {

        ResponseSafe2Pay response = Client.HttpClient("GET", "v2/MerchantBankData/Get", null, false);
        return response;
    }
      
      public static ResponseSafe2Pay List(String CreatedDateInitial, String CreatedDateEnd,int PageNumber,int RowsPerPage) {

        ResponseSafe2Pay response = Client.HttpClient("GET",  MessageFormat.format("v2/Transfer/List?CreatedDateInitial={0}&CreatedDateEnd={1}&PageNumber={2}&RowsPerPage={3}", CreatedDateInitial,CreatedDateEnd,PageNumber,RowsPerPage), null, false);
        return response;
      }

    public static ResponseSafe2Pay Detail(int Id) {

        ResponseSafe2Pay response = Client.HttpClient("GET", "v2/Transfer/Get?Id=".concat(Integer.toString(Id)), null, false);
        return response;
    }
    
      
}
