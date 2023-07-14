package com.safe2pay.DTO.Payment;


import com.safe2pay.DTO.Payment.AccountDebitTransaction;
import java.util.Date;

public class Payment {

    private String Code;
    private Date DueDate;
    private AccountDebitTransaction AccountDebitTransaction;

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public Date getDueDate() {
        return DueDate;
    }

    public void setDueDate(Date DueDate) {
        this.DueDate = DueDate;
    }

    public AccountDebitTransaction getAccountDebitTransaction() {
        return AccountDebitTransaction;
    }

    public void setAccountDebitTransaction(AccountDebitTransaction AccountDebitTransaction) {
        this.AccountDebitTransaction = AccountDebitTransaction;
    }

}
