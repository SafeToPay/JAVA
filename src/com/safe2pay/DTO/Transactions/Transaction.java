package com.safe2pay.DTO.Transactions;

public class Transaction extends Base {

    private Object PaymentObject;

    public Object getPaymentObject() {
        return PaymentObject;
    }

    public void setPaymentObject(Object PaymentObject) {
        this.PaymentObject = PaymentObject;
    }

}
