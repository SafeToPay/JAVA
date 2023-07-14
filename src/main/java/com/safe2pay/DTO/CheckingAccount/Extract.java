package com.safe2pay.DTO.CheckingAccount;

import com.safe2pay.DTO.Payment.PaymentMethod;

public class Extract {

    public PaymentMethod PaymentMethod;
    public float Amount;
    public float Tax;
    public String Description;
    public String Reference;
    public int InstallmentCurrent;
    public int InstallmentQuantity;
    public int IdTransaction;

    public PaymentMethod getPaymentMethod() {
        return PaymentMethod;
    }

    public void setPaymentMethod(PaymentMethod PaymentMethod) {
        this.PaymentMethod = PaymentMethod;
    }

    public float getAmount() {
        return Amount;
    }

    public void setAmount(float Amount) {
        this.Amount = Amount;
    }

    public float getTax() {
        return Tax;
    }

    public void setTax(float Tax) {
        this.Tax = Tax;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getReference() {
        return Reference;
    }

    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    public int getInstallmentCurrent() {
        return InstallmentCurrent;
    }

    public void setInstallmentCurrent(int InstallmentCurrent) {
        this.InstallmentCurrent = InstallmentCurrent;
    }

    public int getInstallmentQuantity() {
        return InstallmentQuantity;
    }

    public void setInstallmentQuantity(int InstallmentQuantity) {
        this.InstallmentQuantity = InstallmentQuantity;
    }

    public int getIdTransaction() {
        return IdTransaction;
    }

    public void setIdTransaction(int IdTransaction) {
        this.IdTransaction = IdTransaction;
    }
}
