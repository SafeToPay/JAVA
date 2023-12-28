package com.safe2pay.API;

import com.safe2pay.CORE.Client;
import com.safe2pay.DTO.Payment.CreditCard;
import com.safe2pay.DTO.Response.ResponseSafe2Pay;

public interface TokenizationAPI {

    static ResponseSafe2Pay create(CreditCard card) {
        return Client.makeCallToApi("POST", "v2/token", card, true);
    }

}
