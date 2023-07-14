package com.safe2pay.DTO.CheckingAccount;

import java.util.ArrayList;

public class Deposit {

    public String DepositDate;
    public float Amount;
    public boolean IsTransferred;
    public float Tax;
    public ArrayList<Extract> Extracts;
    public int TotalItems;

    public String getDepositDate() {
        return DepositDate;
    }

    public void setDepositDate(String DepositDate) {
        this.DepositDate = DepositDate;
    }

    public float getAmount() {
        return Amount;
    }

    public void setAmount(float Amount) {
        this.Amount = Amount;
    }

    public boolean isIsTransferred() {
        return IsTransferred;
    }

    public void setIsTransferred(boolean IsTransferred) {
        this.IsTransferred = IsTransferred;
    }

    public float getTax() {
        return Tax;
    }

    public void setTax(float Tax) {
        this.Tax = Tax;
    }

    public ArrayList<Extract> getExtracts() {
        return Extracts;
    }

    public void setExtracts(ArrayList<Extract> Extracts) {
        this.Extracts = Extracts;
    }

    public int getTotalItems() {
        return TotalItems;
    }

    public void setTotalItems(int TotalItems) {
        this.TotalItems = TotalItems;
    }

}
