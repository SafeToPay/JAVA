package com.safe2pay.DTO.Payment;

import com.safe2pay.DTO.Bank.BankData;
import java.util.Date;

public class DebitAccount {

    private int Id;
    private BankData BankData;
    private boolean IsRecurring;
    private int RecurringDayMonth;
    private int DebitId;
    private String DebitCode;
    private Date DueDate;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public BankData getBankData() {
        return BankData;
    }

    public void setBankData(BankData BankData) {
        this.BankData = BankData;
    }

    public boolean isIsRecurring() {
        return IsRecurring;
    }

    public void setIsRecurring(boolean IsRecurring) {
        this.IsRecurring = IsRecurring;
    }

    public int getRecurringDayMonth() {
        return RecurringDayMonth;
    }

    public void setRecurringDayMonth(int RecurringDayMonth) {
        this.RecurringDayMonth = RecurringDayMonth;
    }

    public int getDebitId() {
        return DebitId;
    }

    public void setDebitId(int DebitId) {
        this.DebitId = DebitId;
    }

    public String getDebitCode() {
        return DebitCode;
    }

    public void setDebitCode(String DebitCode) {
        this.DebitCode = DebitCode;
    }

    public Date getDueDate() {
        return DueDate;
    }

    public void setDueDate(Date DueDate) {
        this.DueDate = DueDate;
    }
}
