package com.safe2pay.DTO.Payment;


import com.safe2pay.DTO.Payment.BankSlip;
import java.util.ArrayList;

public class Carnet {

    private int Id;
    private int IdCarnetLot;
    private String Identifier;
    private String Reference;
    private boolean IsProcessed;
    private boolean IsAsync;
    private String Message;
    private float PenaltyAmount;
    private float InterestAmount;
    private boolean PayableAfterDue;
    private boolean IsEnablePartialPayment;
    private ArrayList<BankSlip> BankSlips;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getIdCarnetLot() {
        return IdCarnetLot;
    }

    public void setIdCarnetLot(int IdCarnetLot) {
        this.IdCarnetLot = IdCarnetLot;
    }

    public String getIdentifier() {
        return Identifier;
    }

    public void setIdentifier(String Identifier) {
        this.Identifier = Identifier;
    }

    public String getReference() {
        return Reference;
    }

    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    public boolean isIsProcessed() {
        return IsProcessed;
    }

    public void setIsProcessed(boolean IsProcessed) {
        this.IsProcessed = IsProcessed;
    }

    public boolean isIsAsync() {
        return IsAsync;
    }

    public void setIsAsync(boolean IsAsync) {
        this.IsAsync = IsAsync;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public float getPenaltyAmount() {
        return PenaltyAmount;
    }

    public void setPenaltyAmount(float PenaltyAmount) {
        this.PenaltyAmount = PenaltyAmount;
    }

    public float getInterestAmount() {
        return InterestAmount;
    }

    public void setInterestAmount(float InterestAmount) {
        this.InterestAmount = InterestAmount;
    }

    public boolean isPayableAfterDue() {
        return PayableAfterDue;
    }

    public void setPayableAfterDue(boolean PayableAfterDue) {
        this.PayableAfterDue = PayableAfterDue;
    }

    public boolean isIsEnablePartialPayment() {
        return IsEnablePartialPayment;
    }

    public void setIsEnablePartialPayment(boolean IsEnablePartialPayment) {
        this.IsEnablePartialPayment = IsEnablePartialPayment;
    }

    public ArrayList<BankSlip> getBankSlips() {
        return BankSlips;
    }

    public void setBankSlips(ArrayList<BankSlip> BankSlips) {
        this.BankSlips = BankSlips;
    }

}
