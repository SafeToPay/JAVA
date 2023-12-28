package com.safe2pay.dto.transactions;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.safe2pay.dto.general.customer.CustomerS2P;
import com.safe2pay.dto.general.ProductS2P;
import com.safe2pay.dto.payment.PaymentMethod;
import lombok.*;

import java.util.List;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Base {

    @JsonProperty("Id")
    private int id;
    @JsonProperty("IdTransaction")
    private int idTransaction;
    @JsonProperty("PaymentMethod")
    private PaymentMethod paymentMethod;
    @JsonProperty("TransactionStatus")
    private TransactionStatus transactionStatus;
    @JsonProperty("Customer")
    private CustomerS2P customer;
    @JsonProperty("Amount")
    private float amount;
    @JsonProperty("TaxValue")
    private float taxValue;
    @JsonProperty("Currency")
    private String currency;
    @JsonProperty("Application")
    private String application;
    @JsonProperty("Reference")
    private String reference;
    @JsonProperty("NegotiationTax")
    private float negotiationTax;
    @JsonProperty("AcquirerTax")
    private float acquirerTax;
    @JsonProperty("DiscountAmount")
    private float discountAmount;
    @JsonProperty("Vendor")
    private String vendor;
    @JsonProperty("CallbackUrl")
    private String callbackUrl;
    @JsonProperty("IsExcluded")
    private boolean isExcluded;
    @JsonProperty("PaymentDate")
    private Date paymentDate;
    @JsonProperty("CreatedDate")
    private Date createdDate;
    @JsonProperty("Splits")
    private List<Split> splits;
    @JsonProperty("NetValue")
    private float netValue;
    @JsonProperty("IsSandbox")
    private boolean isSandbox;
    @JsonProperty("IsSplitter")
    private boolean isSplitter;
    @JsonProperty("Products")
    private List<ProductS2P> products;
    @JsonProperty("IdSubscription")
    private int idSubscription;
    @JsonProperty("PaymentInfo")
    private String paymentInfo;
    @JsonProperty("CardBrand")
    private String cardBrand;
    @JsonProperty("ApiVersion")
    private int apiVersion;

    public void setPaymentMethod(String Code) {
        this.paymentMethod = new PaymentMethod(Code);
    }

    public boolean isExcluded() {
        return isExcluded;
    }

    public void setExcluded(boolean IsExcluded) {
        this.isExcluded = IsExcluded;
    }

    public boolean isSandbox() {
        return isSandbox;
    }

    public void setSandbox(boolean IsSandbox) {
        this.isSandbox = IsSandbox;
    }

    public boolean isSplitter() {
        return isSplitter;
    }

    public void setSplitter(boolean IsSplitter) {
        this.isSplitter = IsSplitter;
    }

}
