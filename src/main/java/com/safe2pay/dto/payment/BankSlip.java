package com.safe2pay.dto.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

import java.util.ArrayList;

public class BankSlip {

    @JsonProperty("Id")
    private int id;
    @JsonProperty("IdCarnet")
    private int idCarnet;
    @JsonProperty("IdTransaction")
    private int idTransaction;
    @JsonProperty("BankSlipNumber")
    private String bankSlipNumber;
    @JsonProperty("DigitableLine")
    private String digitableLine;
    @JsonProperty("Barcode")
    private String barcode;
    @JsonProperty("File")
    private String file;
    @JsonProperty("Amount")
    private double amount;
    @JsonProperty("DueDate")
    private String dueDate;
    @JsonProperty("Instruction")
    private String instruction;
    @JsonProperty("Message")
    private ArrayList<String> message;
    @JsonProperty("PenaltyRate")
    private double penaltyRate;
    @JsonProperty("InterestRate")
    private double interestRate;
    @JsonProperty("BankSplipUrl")
    private String bankSplipUrl;
    @JsonProperty("CancelAfterDue")
    private boolean cancelAfterDue;
    @JsonProperty("IsEnablePartialPayment")
    private boolean isEnablePartialPayment;
    @JsonProperty("DaysBeforeCancel")
    private int daysBeforeCancel;
    @JsonProperty("IdMerchant")
    private int idMerchant;

    @Builder
    public BankSlip(int id, int idCarnet, int idTransaction, long seedNumber, String bankSlipNumber, String digitableLine, String barcode, String file, double amount, String dueDate, String instruction, ArrayList<String> message, double penaltyRate, double interestRate, String bankSplipUrl, boolean cancelAfterDue, boolean isEnablePartialPayment, int daysBeforeCancel, int idMerchant) {
        this.id = id;
        this.idCarnet = idCarnet;
        this.idTransaction = idTransaction;
        this.bankSlipNumber = bankSlipNumber;
        this.digitableLine = digitableLine;
        this.barcode = barcode;
        this.file = file;
        this.amount = amount;
        this.dueDate = dueDate;
        this.instruction = instruction;
        this.message = message;
        this.penaltyRate = penaltyRate;
        this.interestRate = interestRate;
        this.bankSplipUrl = bankSplipUrl;
        this.cancelAfterDue = cancelAfterDue;
        this.isEnablePartialPayment = isEnablePartialPayment;
        this.daysBeforeCancel = daysBeforeCancel;
        this.idMerchant = idMerchant;
    }

    public BankSlip() {
    }

    public int getId() {
        return id;
    }

    public void setId(int Id) {
        this.id = Id;
    }

    public int getIdCarnet() {
        return idCarnet;
    }

    public void setIdCarnet(int IdCarnet) {
        this.idCarnet = IdCarnet;
    }

    public int getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(int IdTransaction) {
        this.idTransaction = IdTransaction;
    }

    public String getBankSlipNumber() {
        return bankSlipNumber;
    }

    public void setBankSlipNumber(String BankSlipNumber) {
        this.bankSlipNumber = BankSlipNumber;
    }

    public String getDigitableLine() {
        return digitableLine;
    }

    public void setDigitableLine(String DigitableLine) {
        this.digitableLine = DigitableLine;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String Barcode) {
        this.barcode = Barcode;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String File) {
        this.file = File;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double AmountPayment) {
        this.amount = AmountPayment;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String DueDate) {
        this.dueDate = DueDate;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String Instruction) {
        this.instruction = Instruction;
    }

    public ArrayList<String> getMessage() {
        return message;
    }

    public void setMessage(ArrayList<String> Message) {
        this.message = Message;
    }

    public double getPenaltyRate() {
        return penaltyRate;
    }

    public void setPenaltyRate(double PenaltyRate) {
        this.penaltyRate = PenaltyRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double InterestRate) {
        this.interestRate = InterestRate;
    }

    public String getBankSplipUrl() {
        return bankSplipUrl;
    }

    public void setBankSplipUrl(String BankSplipUrl) {
        this.bankSplipUrl = BankSplipUrl;
    }

    public boolean isCancelAfterDue() {
        return cancelAfterDue;
    }

    public void setCancelAfterDue(boolean CancelAfterDue) {
        this.cancelAfterDue = CancelAfterDue;
    }

    public boolean isIsEnablePartialPayment() {
        return isEnablePartialPayment;
    }

    public void setIsEnablePartialPayment(boolean IsEnablePartialPayment) {
        this.isEnablePartialPayment = IsEnablePartialPayment;
    }

    public int getDaysBeforeCancel() {
        return daysBeforeCancel;
    }

    public void setDaysBeforeCancel(int DaysBeforeCancel) {
        this.daysBeforeCancel = DaysBeforeCancel;
    }

    public int getIdMerchant() {
        return idMerchant;
    }

    public void setIdMerchant(int IdMerchant) {
        this.idMerchant = IdMerchant;
    }

}
