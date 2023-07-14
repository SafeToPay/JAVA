package com.safe2pay.DTO.CheckingAccount;

import com.safe2pay.DTO.Merchant.Merchant;
import com.safe2pay.DTO.Payment.PaymentMethod;
import java.util.Date;

public class CheckingAccount {

    public int Id;
    public Merchant Merchant;
    public PaymentMethod PaymentMethod;
    public int IdTransaction;
    public String Description;
    public String Reference;
    public Float Amount;
    public Float Tax;
    public Boolean IsTransferred;
    public Boolean IsToday;
    public Date ReleaseDate;
    public Date CreatedDate;
    public int InstallmentNumber;
    public int InstallmentQuantity;

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

    public int getIdTransaction() {
        return IdTransaction;
    }

    public void setIdTransaction(int IdTransaction) {
        this.IdTransaction = IdTransaction;
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

    public Float getAmount() {
        return Amount;
    }

    public void setAmount(Float Amount) {
        this.Amount = Amount;
    }

    public Float getTax() {
        return Tax;
    }

    public void setTax(Float Tax) {
        this.Tax = Tax;
    }

    public Boolean getIsTransferred() {
        return IsTransferred;
    }

    public void setIsTransferred(Boolean IsTransferred) {
        this.IsTransferred = IsTransferred;
    }

    public Boolean getIsToday() {
        return IsToday;
    }

    public void setIsToday(Boolean IsToday) {
        this.IsToday = IsToday;
    }

    public Date getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(Date ReleaseDate) {
        this.ReleaseDate = ReleaseDate;
    }

    public Date getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(Date CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    public int getInstallmentNumber() {
        return InstallmentNumber;
    }

    public void setInstallmentNumber(int InstallmentNumber) {
        this.InstallmentNumber = InstallmentNumber;
    }

    public int getInstallmentQuantity() {
        return InstallmentQuantity;
    }

    public void setInstallmentQuantity(int InstallmentQuantity) {
        this.InstallmentQuantity = InstallmentQuantity;
    }
}
