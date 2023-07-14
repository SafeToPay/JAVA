package com.safe2pay.DTO.Payment;

import java.util.ArrayList;


    public class PaymentObjectCarnet
    {
        private ArrayList<BankSlip> BankSlips;

    public ArrayList<BankSlip> getBankSlips() {
        return BankSlips;
    }

    public void setBankSlips(ArrayList<BankSlip> BankSlips) {
        this.BankSlips = BankSlips;
    }
        
        
    }
