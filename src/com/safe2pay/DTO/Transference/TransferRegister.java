package com.safe2pay.DTO.Transference;

import com.safe2pay.DTO.Bank.BankData;
import java.util.*;
import java.math.*;

public class TransferRegister {

    private int Id;

    public final int getId() {
        return Id;
    }

    public final void setId(int value) {
        Id = value;
    }
    private int IdTransfer;

    public final int getIdTransfer() {
        return IdTransfer;
    }

    public final void setIdTransfer(int value) {
        IdTransfer = value;
    }
    private int IdMerchant;

    public final int getIdMerchant() {
        return IdMerchant;
    }

    public final void setIdMerchant(int value) {
        IdMerchant = value;
    }
    private BankData BankData;

    public final BankData getBankData() {
        return BankData;
    }

    public final void setBankData(BankData value) {
        BankData = value;
    }
    private String ReceiverName;

    public final String getReceiverName() {
        return ReceiverName;
    }

    public final void setReceiverName(String value) {
        ReceiverName = value;
    }
    private String Identity;

    public final String getIdentity() {
        return Identity;
    }

    public final void setIdentity(String value) {
        Identity = value;
    }
    private BigDecimal Amount = new BigDecimal(0);

    public final BigDecimal getAmount() {
        return Amount;
    }

    public final void setAmount(BigDecimal value) {
        Amount = value;
    }
    private String Identification;

    public final String getIdentification() {
        return Identification;
    }

    public final void setIdentification(String value) {
        Identification = value;
    }
    private String CallbackUrl;

    public final String getCallbackUrl() {
        return CallbackUrl;
    }

    public final void setCallbackUrl(String value) {
        CallbackUrl = value;
    }
    private boolean IsTransferred;

    public final boolean getIsTransferred() {
        return IsTransferred;
    }

    public final void setIsTransferred(boolean value) {
        IsTransferred = value;
    }
    private boolean IsReleaseTransfer;

    public final boolean getIsReleaseTransfer() {
        return IsReleaseTransfer;
    }

    public final void setIsReleaseTransfer(boolean value) {
        IsReleaseTransfer = value;
    }
    private boolean IsNotified;

    public final boolean getIsNotified() {
        return IsNotified;
    }

    public final void setIsNotified(boolean value) {
        IsNotified = value;
    }
    private boolean IsReturned;

    public final boolean getIsReturned() {
        return IsReturned;
    }

    public final void setIsReturned(boolean value) {
        IsReturned = value;
    }
    private String HashScheduling;

    public final String getHashScheduling() {
        return HashScheduling;
    }

    public final void setHashScheduling(String value) {
        HashScheduling = value;
    }
    private String HashConfirmation;

    public final String getHashConfirmation() {
        return HashConfirmation;
    }

    public final void setHashConfirmation(String value) {
        HashConfirmation = value;
    }
    private Date CompensationDate;

    public Date getCompensationDate() {
        return CompensationDate;
    }

    public void setCompensationDate(Date CompensationDate) {
        this.CompensationDate = CompensationDate;
    }
    private Date CreatedDate;

    public Date getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(Date CreatedDate) {
        this.CreatedDate = CreatedDate;
    }
    private Date ChangedDate;

    public Date getChangedDate() {
        return ChangedDate;
    }

    public void setChangedDate(Date ChangedDate) {
        this.ChangedDate = ChangedDate;
    }

    private String Validation;

    public final String getValidation() {
        return Validation;
    }

    public final void setValidation(String value) {
        Validation = value;
    }
}