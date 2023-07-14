package com.safe2pay.DTO.Merchant;

import com.safe2pay.DTO.Payment.PaymentMethod;
import java.util.ArrayList;

public class MerchantSplit {

    public String PaymentMethodCode;
    public PaymentMethod PaymentMethod;
    public boolean IsSubaccountTaxPayer;
    public ArrayList<MerchantSplitTax> Taxes;

    public String getPaymentMethodCode() {
        return PaymentMethodCode;
    }

    public void setPaymentMethodCode(String PaymentMethodCode) {
        this.PaymentMethodCode = PaymentMethodCode;
    }

    public PaymentMethod getPaymentMethod() {
        return PaymentMethod;
    }

    public void setPaymentMethod(PaymentMethod PaymentMethod) {
        this.PaymentMethod = PaymentMethod;
    }

    public boolean isIsSubaccountTaxPayer() {
        return IsSubaccountTaxPayer;
    }

    public void setIsSubaccountTaxPayer(boolean IsSubaccountTaxPayer) {
        this.IsSubaccountTaxPayer = IsSubaccountTaxPayer;
    }

    public ArrayList<MerchantSplitTax> getTaxes() {
        return Taxes;
    }

    public void setTaxes(ArrayList<MerchantSplitTax> Taxes) {
        this.Taxes = Taxes;
    }
    
    
}
