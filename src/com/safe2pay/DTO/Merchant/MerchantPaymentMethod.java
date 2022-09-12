package com.safe2pay.DTO.Merchant;

import com.safe2pay.DTO.Payment.PaymentMethod;

public class MerchantPaymentMethod {

    private int Id;
    private Merchant Merchant;
    private PaymentMethod PaymentMethod;
    private boolean IsEnabled;
    private int InstallmentLimit;
    private float MinorInstallmentAmount;

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

    public PaymentMethod getPaymentMethod() {
        return PaymentMethod;
    }

    public void setPaymentMethod(PaymentMethod PaymentMethod) {
        this.PaymentMethod = PaymentMethod;
    }

    public boolean isIsEnabled() {
        return IsEnabled;
    }

    public void setIsEnabled(boolean IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    public int getInstallmentLimit() {
        return InstallmentLimit;
    }

    public void setInstallmentLimit(int InstallmentLimit) {
        this.InstallmentLimit = InstallmentLimit;
    }

    public float getMinorInstallmentAmount() {
        return MinorInstallmentAmount;
    }

    public void setMinorInstallmentAmount(float MinorInstallmentAmount) {
        this.MinorInstallmentAmount = MinorInstallmentAmount;
    }
}
