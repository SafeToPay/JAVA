package com.safe2pay.DTO.SingleSale;


import com.safe2pay.DTO.Payment.PaymentMethod;
import java.util.Date;


    public class SingleSalePayment
    {
        public PaymentMethod PaymentMethod;
        public Date PaymentDate;

    public PaymentMethod getPaymentMethod() {
        return PaymentMethod;
    }

    public void setPaymentMethod(PaymentMethod PaymentMethod) {
        this.PaymentMethod = PaymentMethod;
    }

    public Date getPaymentDate() {
        return PaymentDate;
    }

    public void setPaymentDate(Date PaymentDate) {
        this.PaymentDate = PaymentDate;
    }
    }
