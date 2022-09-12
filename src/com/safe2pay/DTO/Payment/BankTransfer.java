package com.safe2pay.DTO.Payment;

public class BankTransfer {

    private int Provider;
    private String Token;
    private String AuthenticationUrl;

    public int getProvider() {
        return Provider;
    }

    public void setProvider(int Provider) {
        this.Provider = Provider;
    }

    public String getToken() {
        return Token;
    }

    public void setToken(String Token) {
        this.Token = Token;
    }

    public String getAuthenticationUrl() {
        return AuthenticationUrl;
    }

    public void setAuthenticationUrl(String AuthenticationUrl) {
        this.AuthenticationUrl = AuthenticationUrl;
    }

}
