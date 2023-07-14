package com.safe2pay.DTO.Payment;

public class CarnetItems {

    public int Id;
    public String Identifier;
    public String Reference;
    public boolean IsProcessed;
    public String Message;
    public PaymentObjectCarnet PaymentObject;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
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

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public PaymentObjectCarnet getPaymentObject() {
        return PaymentObject;
    }

    public void setPaymentObject(PaymentObjectCarnet PaymentObject) {
        this.PaymentObject = PaymentObject;
    }
}
