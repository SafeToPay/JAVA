package com.safe2pay.DTO.Bank;

public class BankData {

    private Bank Bank;
    private String BankAgency;
    private String BankAgencyDigit;
    private String BankAccount;
    private String BankAccountDigit;
    private String Operation;

    public BankData() {
    }

    public Bank getBank() {
        return Bank;
    }

    public void setBank(Bank Bank) {
        this.Bank = Bank;
    }

    public void setBank(String Code) {
        Bank bank = new Bank();
        bank.setCode(Code);
        this.Bank = bank;
    }

    public String getBankAgency() {
        return BankAgency;
    }

    public void setBankAgency(String BankAgency) {
        this.BankAgency = BankAgency;
    }

    public String getBankAgencyDigit() {
        return BankAgencyDigit;
    }

    public void setBankAgencyDigit(String BankAgencyDigit) {
        this.BankAgencyDigit = BankAgencyDigit;
    }

    public String getBankAccount() {
        return BankAccount;
    }

    public void setBankAccount(String BankAccount) {
        this.BankAccount = BankAccount;
    }

    public String getBankAccountDigit() {
        return BankAccountDigit;
    }

    public void setBankAccountDigit(String BankAccountDigit) {
        this.BankAccountDigit = BankAccountDigit;
    }

    public String getOperation() {
        return Operation;
    }

    public void setOperation(String Operation) {
        this.Operation = Operation;
    }
}
