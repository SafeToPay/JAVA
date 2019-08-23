package com.safe2pay.DTO.CheckingAccount;

import java.util.ArrayList;

public class CheckingAccountList extends ArrayList<CheckingAccount> {

    private float TotalAmountDay;
    private boolean IsReceived;
    private float TotalTax;
    private String SelectDate;

    public float getTotalAmountDay() {
        return TotalAmountDay;
    }

    public void setTotalAmountDay(float TotalAmountDay) {
        this.TotalAmountDay = TotalAmountDay;
    }

    public boolean isIsReceived() {
        return IsReceived;
    }

    public void setIsReceived(boolean IsReceived) {
        this.IsReceived = IsReceived;
    }

    public float getTotalTax() {
        return TotalTax;
    }

    public void setTotalTax(float TotalTax) {
        this.TotalTax = TotalTax;
    }

    public String getSelectDate() {
        return SelectDate;
    }

    public void setSelectDate(String SelectDate) {
        this.SelectDate = SelectDate;
    }

}
