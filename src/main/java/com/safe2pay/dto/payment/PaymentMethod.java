package com.safe2pay.dto.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

public class PaymentMethod {

    @JsonProperty("Id")
    private int id;
    @JsonProperty("Code")
    private String code;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("CodePaymentMethod")
    private String codePaymentMethod;

    public PaymentMethod(String Code) {
        this.code = Code;
    }

    @Builder
    public PaymentMethod(int id, String code, String name, String codePaymentMethod) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.codePaymentMethod = codePaymentMethod;
    }

    public PaymentMethod() {
    }

    public int getId() {
        return id;
    }

    public void setId(int Id) {
        this.id = Id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String Code) {
        this.code = Code;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getCodePaymentMethod() {
        return codePaymentMethod;
    }

    public void setCodePaymentMethod(String CodePaymentMethod) {
        this.codePaymentMethod = CodePaymentMethod;
    }
}
