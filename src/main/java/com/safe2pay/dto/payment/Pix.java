package com.safe2pay.dto.payment;

public class Pix {

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
