package com.safe2pay.DTO.Payment;

public class PaymentMethod {

    private int Id;
    private String Code;
    private String Name;

    public PaymentMethod(String Code) {
        this.Code = Code;
    }

    public PaymentMethod() {
    }

    //Para Invoice
    private String CodePaymentMethod;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCodePaymentMethod() {
        return CodePaymentMethod;
    }

    public void setCodePaymentMethod(String CodePaymentMethod) {
        this.CodePaymentMethod = CodePaymentMethod;
    }
}
