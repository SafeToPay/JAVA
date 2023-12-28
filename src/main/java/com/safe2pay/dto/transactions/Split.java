package com.safe2pay.dto.transactions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

enum EnumTaxType {
    None,
    Percentage,
    Amount
}


enum EnumReceiverType {
    NONE,
    MERCHANT,
    SUBACCOUNT
}

public class Split {

    @JsonProperty("Identity")
    private String identity;
    @JsonProperty("IsPayTax")
    private boolean isPayTax;
    @JsonProperty("Amount")
    private float amount;
    @JsonProperty("CodeTaxType")
    private EnumTaxType codeTaxType;
    @JsonProperty("CodeReceiverType")
    private EnumReceiverType codeReceiverType;

    @Builder
    public Split(String identity, boolean isPayTax, float amount, EnumTaxType codeTaxType, EnumReceiverType codeReceiverType) {
        this.identity = identity;
        this.isPayTax = isPayTax;
        this.amount = amount;
        this.codeTaxType = codeTaxType;
        this.codeReceiverType = codeReceiverType;
    }

    public Split() {
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public boolean isPayTax() {
        return isPayTax;
    }

    public void setPayTax(boolean payTax) {
        isPayTax = payTax;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public EnumTaxType getCodeTaxType() {
        return codeTaxType;
    }

    public void setCodeTaxType(EnumTaxType codeTaxType) {
        this.codeTaxType = codeTaxType;
    }

    public EnumReceiverType getCodeReceiverType() {
        return codeReceiverType;
    }

    public void setCodeReceiverType(EnumReceiverType codeReceiverType) {
        this.codeReceiverType = codeReceiverType;
    }
}