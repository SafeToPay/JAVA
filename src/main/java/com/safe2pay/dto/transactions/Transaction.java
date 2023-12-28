package com.safe2pay.dto.transactions;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Transaction extends Base {

    @JsonProperty("PaymentObject")
    private Object paymentObject;

    public Object getPaymentObject() {
        return paymentObject;
    }

    public void setPaymentObject(Object PaymentObject) {
        this.paymentObject = PaymentObject;
    }

}
