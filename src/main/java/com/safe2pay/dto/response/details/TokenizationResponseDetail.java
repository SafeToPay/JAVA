package com.safe2pay.dto.response.details;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TokenizationResponseDetail {

    @JsonProperty("Token")
    private String token;

    public TokenizationResponseDetail(String token) {
        this.token = token;
    }

    public TokenizationResponseDetail() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
