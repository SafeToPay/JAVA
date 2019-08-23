package com.safe2pay.DTO.Merchant;

import com.safe2pay.DTO.Plan.PlanFrequence;

public class MerchantPaymentDate {

    private int Id;
    private Merchant Merchant;
    private PlanFrequence PlanFrequence;
    private int PaymentDay;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Merchant getMerchant() {
        return Merchant;
    }

    public void setMerchant(Merchant Merchant) {
        this.Merchant = Merchant;
    }

    public PlanFrequence getPlanFrequence() {
        return PlanFrequence;
    }

    public void setPlanFrequence(PlanFrequence PlanFrequence) {
        this.PlanFrequence = PlanFrequence;
    }

    public int getPaymentDay() {
        return PaymentDay;
    }

    public void setPaymentDay(int PaymentDay) {
        this.PaymentDay = PaymentDay;
    }

}
