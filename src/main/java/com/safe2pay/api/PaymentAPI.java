package com.safe2pay.api;

import com.safe2pay.Client;
import com.safe2pay.dto.response.details.BankSlipResponseDetail;
import com.safe2pay.dto.response.details.CreditCardResponseDetail;
import com.safe2pay.dto.response.ResponseSafe2Pay;
import com.safe2pay.dto.response.details.PixResponseDetail;
import com.safe2pay.dto.transactions.Transaction;

public interface PaymentAPI {

    static ResponseSafe2Pay<BankSlipResponseDetail> payWithBankSlip(Transaction payload) {
        return Client.makeCallToApi("POST", "v2/Payment", payload, true, BankSlipResponseDetail.class);
    }

    static ResponseSafe2Pay<PixResponseDetail> payWithPix(Transaction payload) {
        return Client.makeCallToApi("POST", "v2/Payment", payload, true, PixResponseDetail.class);
    }

    static ResponseSafe2Pay<CreditCardResponseDetail> payWithCreditCard(Transaction payload) {
        return Client.makeCallToApi("POST", "v2/Payment", payload, true, CreditCardResponseDetail.class);
    }

}
