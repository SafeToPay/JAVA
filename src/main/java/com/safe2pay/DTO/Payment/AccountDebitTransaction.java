package com.safe2pay.DTO.Payment;

import java.util.Date;

public class AccountDebitTransaction {

    private int Id;
    private int PaymentId;
    private String Status;
    private String TransactionStatus;
    private String TransactionStatusMessage;
    private Date TransactionStatusDate;
    private Date TransactionDebitDate;
    private Date CreatedDate;
    private Date UpdatedDate;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getPaymentId() {
        return PaymentId;
    }

    public void setPaymentId(int PaymentId) {
        this.PaymentId = PaymentId;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getTransactionStatus() {
        return TransactionStatus;
    }

    public void setTransactionStatus(String TransactionStatus) {
        this.TransactionStatus = TransactionStatus;
    }

    public String getTransactionStatusMessage() {
        return TransactionStatusMessage;
    }

    public void setTransactionStatusMessage(String TransactionStatusMessage) {
        this.TransactionStatusMessage = TransactionStatusMessage;
    }

    public Date getTransactionStatusDate() {
        return TransactionStatusDate;
    }

    public void setTransactionStatusDate(Date TransactionStatusDate) {
        this.TransactionStatusDate = TransactionStatusDate;
    }

    public Date getTransactionDebitDate() {
        return TransactionDebitDate;
    }

    public void setTransactionDebitDate(Date TransactionDebitDate) {
        this.TransactionDebitDate = TransactionDebitDate;
    }

    public Date getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(Date CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    public Date getUpdatedDate() {
        return UpdatedDate;
    }

    public void setUpdatedDate(Date UpdatedDate) {
        this.UpdatedDate = UpdatedDate;
    }

}
