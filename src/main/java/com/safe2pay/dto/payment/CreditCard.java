package com.safe2pay.dto.payment;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

public class CreditCard {

    @JsonProperty("Holder")
    private String holder;
    @JsonProperty("CardNumber")
    private String cardNumber;
    @JsonProperty("ExpirationDate")
    private String expirationDate;
    @JsonProperty("SecurityCode")
    private String securityCode;
    @JsonProperty("Token")
    private String token;
    @JsonProperty("InstallmentQuantity")
    private int installmentQuantity;
    @JsonProperty("IsCancelled")
    private boolean isCancelled;

    @Builder
    public CreditCard(String holder, String cardNumber, String expirationDate, String securityCode, String token, int installmentQuantity, boolean isCancelled) {
        this.holder = holder;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.securityCode = securityCode;
        this.token = token;
        this.installmentQuantity = installmentQuantity;
        this.isCancelled = isCancelled;
    }

    public CreditCard() {
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String Holder) {
        this.holder = Holder;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String CardNumber) {
        this.cardNumber = CardNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String ExpirationDate) {
        this.expirationDate = ExpirationDate;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String SecurityCode) {
        this.securityCode = SecurityCode;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String Token) {
        this.token = Token;
    }

    public int getInstallmentQuantity() {
        return installmentQuantity;
    }

    public void setInstallmentQuantity(int InstallmentQuantity) {
        this.installmentQuantity = InstallmentQuantity;
    }

    public boolean isIsCancelled() {
        return isCancelled;
    }

    public void setIsCancelled(boolean isCancelled) {
        this.isCancelled = isCancelled;
    }

}
