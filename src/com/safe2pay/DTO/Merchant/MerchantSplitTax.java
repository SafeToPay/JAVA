package com.safe2pay.DTO.Merchant;

import com.safe2pay.DTO.Tax.TaxType;
import java.math.*;

public class MerchantSplitTax {
   
        private  String TaxTypeName;
        private TaxType TaxType;
        private Double Tax;

    public MerchantSplitTax() {
    }

    public MerchantSplitTax(String TaxTypeName, Double Tax) {
        this.TaxTypeName = TaxTypeName;
        this.Tax = Tax;
    }
           

    public String getTaxTypeName() {
        return TaxTypeName;
    }

    public void setTaxTypeName(String TaxTypeName) {
        this.TaxTypeName = TaxTypeName;
    }

    public TaxType getTaxType() {
        return TaxType;
    }

    public void setTaxType(TaxType TaxType) {
        this.TaxType = TaxType;
    }

    public Double getTax() {
        return Tax;
    }

    public void setTax(Double Tax) {
        this.Tax = Tax;
    }
                
                
}


