package com.safe2pay.DTO.CheckingAccount;

public class CheckingAccountBalance {

    private float AmountReceived;
    private float AmountPreview;
    private float AmountCanceled;
    private float AmountContestation;
    private float AmountTaxes;
    private float AmountAvailableToday;

    public float getAmountReceived() {
        return AmountReceived;
    }

    public void setAmountReceived(float AmountReceived) {
        this.AmountReceived = AmountReceived;
    }

    public float getAmountPreview() {
        return AmountPreview;
    }

    public void setAmountPreview(float AmountPreview) {
        this.AmountPreview = AmountPreview;
    }

    public float getAmountCanceled() {
        return AmountCanceled;
    }

    public void setAmountCanceled(float AmountCanceled) {
        this.AmountCanceled = AmountCanceled;
    }

    public float getAmountContestation() {
        return AmountContestation;
    }

    public void setAmountContestation(float AmountContestation) {
        this.AmountContestation = AmountContestation;
    }

    public float getAmountTaxes() {
        return AmountTaxes;
    }

    public void setAmountTaxes(float AmountTaxes) {
        this.AmountTaxes = AmountTaxes;
    }

    public float getAmountAvailableToday() {
        return AmountAvailableToday;
    }

    public void setAmountAvailableToday(float AmountAvailableToday) {
        this.AmountAvailableToday = AmountAvailableToday;
    }
}
