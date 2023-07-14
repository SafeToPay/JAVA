package com.safe2pay.DTO.Merchant;

import java.util.ArrayList;

    public class Configuration
    {
        public ArrayList<MerchantPaymentMethod> MerchantPaymentMethod;
        public Object MerchantNotify;

    public ArrayList<MerchantPaymentMethod> getMerchantPaymentMethod() {
        return MerchantPaymentMethod;
    }

    public void setMerchantPaymentMethod(ArrayList<MerchantPaymentMethod> MerchantPaymentMethod) {
        this.MerchantPaymentMethod = MerchantPaymentMethod;
    }

    public Object getMerchantNotify() {
        return MerchantNotify;
    }

    public void setMerchantNotify(Object MerchantNotify) {
        this.MerchantNotify = MerchantNotify;
    }
    }
