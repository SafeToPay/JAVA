package com.safe2pay.DTO.Transactions;

public class Split {

    public String Identity;
    public boolean IsPayTax;
    public float Amount;
    public EnumTaxType CodeTaxType;
    public EnumReceiverType CodeReceiverType;
}


enum EnumTaxType
    {
        None,
        Percentage,
        Amount
    }

    enum EnumReceiverType
    {
        NONE,
        MERCHANT,
        SUBACCOUNT
    }