package com.safe2pay.DTO.Payment;

import java.util.ArrayList;
import java.util.Date;


    public class BankSlip
    {
        private int Id;
        private int IdCarnet;
        private int IdTransaction;
        private long SeedNumber;
        private String BankSlipNumber;
        private String DigitableLine;
        private String Barcode;
        private String File;
        private double Amount;
        private String DueDate;
        private String Instruction;
        private ArrayList<String> Message;
        private double PenaltyRate;
        private double InterestRate;
        private String BankSplipUrl;
        private boolean CancelAfterDue;
        private boolean IsEnablePartialPayment;
        private int DaysBeforeCancel;
        private int IdMerchant;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getIdCarnet() {
        return IdCarnet;
    }

    public void setIdCarnet(int IdCarnet) {
        this.IdCarnet = IdCarnet;
    }

    public int getIdTransaction() {
        return IdTransaction;
    }

    public void setIdTransaction(int IdTransaction) {
        this.IdTransaction = IdTransaction;
    }

    public long getSeedNumber() {
        return SeedNumber;
    }

    public void setSeedNumber(long SeedNumber) {
        this.SeedNumber = SeedNumber;
    }

    public String getBankSlipNumber() {
        return BankSlipNumber;
    }

    public void setBankSlipNumber(String BankSlipNumber) {
        this.BankSlipNumber = BankSlipNumber;
    }

    public String getDigitableLine() {
        return DigitableLine;
    }

    public void setDigitableLine(String DigitableLine) {
        this.DigitableLine = DigitableLine;
    }

    public String getBarcode() {
        return Barcode;
    }

    public void setBarcode(String Barcode) {
        this.Barcode = Barcode;
    }

    public String getFile() {
        return File;
    }

    public void setFile(String File) {
        this.File = File;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double AmountPayment) {
        this.Amount = AmountPayment;
    }

    public String getDueDate() {
        return DueDate;
    }

    public void setDueDate(String DueDate) {
        this.DueDate = DueDate;
    }

    public String getInstruction() {
        return Instruction;
    }

    public void setInstruction(String Instruction) {
        this.Instruction = Instruction;
    }

    public ArrayList<String> getMessage() {
        return Message;
    }

    public void setMessage(ArrayList<String> Message) {
        this.Message = Message;
    }

    public double getPenaltyRate() {
        return PenaltyRate;
    }

    public void setPenaltyRate(double PenaltyRate) {
        this.PenaltyRate = PenaltyRate;
    }

    public double getInterestRate() {
        return InterestRate;
    }

    public void setInterestRate(double InterestRate) {
        this.InterestRate = InterestRate;
    }

    public String getBankSplipUrl() {
        return BankSplipUrl;
    }

    public void setBankSplipUrl(String BankSplipUrl) {
        this.BankSplipUrl = BankSplipUrl;
    }

    public boolean isCancelAfterDue() {
        return CancelAfterDue;
    }

    public void setCancelAfterDue(boolean CancelAfterDue) {
        this.CancelAfterDue = CancelAfterDue;
    }

    public boolean isIsEnablePartialPayment() {
        return IsEnablePartialPayment;
    }

    public void setIsEnablePartialPayment(boolean IsEnablePartialPayment) {
        this.IsEnablePartialPayment = IsEnablePartialPayment;
    }

    public int getDaysBeforeCancel() {
        return DaysBeforeCancel;
    }

    public void setDaysBeforeCancel(int DaysBeforeCancel) {
        this.DaysBeforeCancel = DaysBeforeCancel;
    }

    public int getIdMerchant() {
        return IdMerchant;
    }

    public void setIdMerchant(int IdMerchant) {
        this.IdMerchant = IdMerchant;
    }

            
    }
