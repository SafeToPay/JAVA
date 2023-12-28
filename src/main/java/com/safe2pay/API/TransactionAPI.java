package com.safe2pay.API;

import com.safe2pay.CORE.Client;
import com.safe2pay.DTO.Response.ResponseSafe2Pay;

public interface TransactionAPI {

    static ResponseSafe2Pay Get(int Id){
        return Client.makeCallToApi("GET", "v2/transaction/Get?Id=".concat(Integer.toString(Id)), null, false);
    }

}
