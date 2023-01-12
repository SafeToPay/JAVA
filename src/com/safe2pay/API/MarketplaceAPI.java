/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safe2pay.API;

import com.safe2pay.CORE.Client;
import com.safe2pay.DTO.Merchant.Merchant;
import com.safe2pay.DTO.Response.ResponseSafe2Pay;
import java.text.MessageFormat;

/**
 *
 * @author lucas.silva
 */
public class MarketplaceAPI {
    
        public static ResponseSafe2Pay Add(Merchant merchant) {

    ResponseSafe2Pay response = Client.HttpClient("POST", "v2/Marketplace/Add", merchant, false);
        return response;
    }

    public static ResponseSafe2Pay Update(Merchant merchant) {

        ResponseSafe2Pay response = Client.HttpClient("PUT", "/v2/Marketplace/Update?id=".concat(Integer.toString(merchant.getId())), merchant, false);
        return response;
    }

    public static ResponseSafe2Pay Delete(int Id) {

        ResponseSafe2Pay response = Client.HttpClient("DELETE", "v2/Marketplace/Delete?id=".concat(Integer.toString(Id)), null, false);
        return response;
    }

      public static ResponseSafe2Pay Get(int Id) {

        ResponseSafe2Pay response = Client.HttpClient("GET", "v2/Marketplace/Get?id=".concat(Integer.toString(Id)), null, false);
        return response;
    }
    
     public static ResponseSafe2Pay List(int PageNumber, int RowsPage) {

        ResponseSafe2Pay response = Client.HttpClient("GET", MessageFormat.format("v2/Marketplace/List?PageNumber={0}&RowsPerPage={1}", PageNumber,RowsPage), null, false);
        return response;
    }
}
