package com.safe2pay.dto.payment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pix {

    @JsonProperty("Expiration")
    private int Expiration;

    public Pix(int expiration) {
        Expiration = expiration;
    }

    public int getExpiration() {
        return Expiration;
    }

    public void setExpiration(int expiration) {
        Expiration = expiration;
    }
}
