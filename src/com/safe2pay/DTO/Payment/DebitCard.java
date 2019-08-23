package com.safe2pay.DTO.Payment;

public class DebitCard {

    private String Holder;
    private String CardNumber;
    private String ExpirationDate;
    private String SecurityCode;
    private String Token;
    private boolean Authenticate;

    public String getHolder() {
        return Holder;
    }

    public void setHolder(String Holder) {
        this.Holder = Holder;
    }

    public String getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(String CardNumber) {
        this.CardNumber = CardNumber;
    }

    public String getExpirationDate() {
        return ExpirationDate;
    }

    public void setExpirationDate(String ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
    }

    public String getSecurityCode() {
        return SecurityCode;
    }

    public void setSecurityCode(String SecurityCode) {
        this.SecurityCode = SecurityCode;
    }

    public String getToken() {
        return Token;
    }

    public void setToken(String Token) {
        this.Token = Token;
    }

    public boolean isAuthenticate() {
        return Authenticate;
    }

    public void setAuthenticate(boolean Authenticate) {
        this.Authenticate = Authenticate;
    }

}
