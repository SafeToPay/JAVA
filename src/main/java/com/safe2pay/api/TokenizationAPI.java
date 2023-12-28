package com.safe2pay.api;

import com.safe2pay.Client;
import com.safe2pay.dto.payment.CreditCard;
import com.safe2pay.dto.response.ResponseSafe2Pay;
import com.safe2pay.dto.response.details.TokenizationResponseDetail;

public interface TokenizationAPI {

    static ResponseSafe2Pay<TokenizationResponseDetail> create(CreditCard card) {
        return Client.makeCallToApi("POST", "v2/token", card, true, TokenizationResponseDetail.class);
    }

}
