package com.safe2pay.API;

import com.safe2pay.CORE.Client;
import com.safe2pay.DTO.Response.ResponseSafe2Pay;
import com.safe2pay.DTO.Transactions.Transaction;

public interface PaymentAPI {

    static ResponseSafe2Pay getPaymentMethods() {
        return Client.makeCallToApi("GET", "v2/MerchantPaymentMethod/List", null, false);
    }

    static ResponseSafe2Pay payWithBankSlip(Transaction payload) {
        return Client.makeCallToApi("POST", "v2/Payment", payload, true);
    }

    static ResponseSafe2Pay payWithCreditCard(Transaction payload) {
        return Client.makeCallToApi("POST", "v2/Payment", payload, true);
    }

    static ResponseSafe2Pay refund(int Id) {
        return Client.makeCallToApi("DELETE", "v2/CreditCard/Cancel/" + Id, null, false);
    }
}
