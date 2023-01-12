package com.safe2pay.DTO.CheckingAccount;

import java.util.ArrayList;

public class CheckingAccountDeposit {

    public String InitialDate;
    public String EndDate;
    public float AmountDeposit;
    public float AmountTax;
    public ArrayList<Deposit> Deposits;

    public String getInitialDate() {
        return InitialDate;
    }

    public void setInitialDate(String InitialDate) {
        this.InitialDate = InitialDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    public float getAmountDeposit() {
        return AmountDeposit;
    }

    public void setAmountDeposit(float AmountDeposit) {
        this.AmountDeposit = AmountDeposit;
    }

    public float getAmountTax() {
        return AmountTax;
    }

    public void setAmountTax(float AmountTax) {
        this.AmountTax = AmountTax;
    }

    public ArrayList<Deposit> getDeposits() {
        return Deposits;
    }

    public void setDeposits(ArrayList<Deposit> Deposits) {
        this.Deposits = Deposits;
    }
    
    
}
