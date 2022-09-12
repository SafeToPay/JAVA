package com.safe2pay.DTO.Tax;

import com.safe2pay.DTO.Tax.TaxType;

public class ListTax {

    private int Id;
    private int IdMerchantPaymentMethod;
    private int InitialInstallment;
    private int EndInstallment;
    private float Amount;
    private TaxType TaxType;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getIdMerchantPaymentMethod() {
        return IdMerchantPaymentMethod;
    }

    public void setIdMerchantPaymentMethod(int IdMerchantPaymentMethod) {
        this.IdMerchantPaymentMethod = IdMerchantPaymentMethod;
    }

    public int getInitialInstallment() {
        return InitialInstallment;
    }

    public void setInitialInstallment(int InitialInstallment) {
        this.InitialInstallment = InitialInstallment;
    }

    public int getEndInstallment() {
        return EndInstallment;
    }

    public void setEndInstallment(int EndInstallment) {
        this.EndInstallment = EndInstallment;
    }

    public float getAmount() {
        return Amount;
    }

    public void setAmount(float Amount) {
        this.Amount = Amount;
    }

    public TaxType getTaxType() {
        return TaxType;
    }

    public void setTaxType(TaxType TaxType) {
        this.TaxType = TaxType;
    }

}
