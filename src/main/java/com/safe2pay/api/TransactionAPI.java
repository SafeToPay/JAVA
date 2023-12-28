package com.safe2pay.api;

import com.safe2pay.Client;
import com.safe2pay.dto.response.ResponseSafe2Pay;
import com.safe2pay.dto.response.details.TransactionResponseDetail;

public interface TransactionAPI {

    static ResponseSafe2Pay<TransactionResponseDetail> Get(int Id){
        return Client.makeCallToApi("GET", "v2/transaction/Get?Id=".concat(Integer.toString(Id)), null, false, TransactionResponseDetail.class);
    }

}
