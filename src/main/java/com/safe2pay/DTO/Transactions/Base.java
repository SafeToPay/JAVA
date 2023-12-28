package com.safe2pay.DTO.Transactions;

import com.safe2pay.DTO.Customer.Customer;
import com.safe2pay.DTO.General.Product;
import com.safe2pay.DTO.Payment.PaymentMethod;

import java.util.ArrayList;
import java.util.Date;

public class Base {

    private int Id;
    private int IdTransaction;
    private PaymentMethod PaymentMethod;
    private TransactionStatus TransactionStatus;
    private Customer Customer;
    private float Amount;
    private float TaxValue;
    private String Currency;
    private String Application;
    private String Reference;
    private float NegotiationTax;
    private float AcquirerTax;
    private float DiscountAmount;
    private String Vendor;
    private String CallbackUrl;
    private boolean IsExcluded;
    private Date PaymentDate;
    private Date CreatedDate;
    private ArrayList<Split> Splits;
    private float NetValue;
    private boolean IsSandbox;
    private boolean IsSplitter;
    private ArrayList<Product> Products;
    private int IdSubscription;
    private String PaymentInfo;
    private String CardBrand;
    private int ApiVersion;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getIdTransaction() {
        return IdTransaction;
    }

    public void setIdTransaction(int IdTransaction) {
        this.IdTransaction = IdTransaction;
    }

    public PaymentMethod getPaymentMethod() {
        return PaymentMethod;
    }

    public void setPaymentMethod(String Code) {
        this.PaymentMethod = new PaymentMethod(Code);
    }

    public TransactionStatus getTransactionStatus() {
        return TransactionStatus;
    }

    public void setTransactionStatus(TransactionStatus TransactionStatus) {
        this.TransactionStatus = TransactionStatus;
    }

    public Customer getCustomer() {
        return Customer;
    }

    public void setCustomer(Customer Customer) {
        this.Customer = Customer;
    }

    public float getAmount() {
        return Amount;
    }

    public void setAmount(float Amount) {
        this.Amount = Amount;
    }

    public float getTaxValue() {
        return TaxValue;
    }

    public void setTaxValue(float TaxValue) {
        this.TaxValue = TaxValue;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    public String getApplication() {
        return Application;
    }

    public void setApplication(String Application) {
        this.Application = Application;
    }

    public String getReference() {
        return Reference;
    }

    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    public float getNegotiationTax() {
        return NegotiationTax;
    }

    public void setNegotiationTax(float NegotiationTax) {
        this.NegotiationTax = NegotiationTax;
    }

    public float getAcquirerTax() {
        return AcquirerTax;
    }

    public void setAcquirerTax(float AcquirerTax) {
        this.AcquirerTax = AcquirerTax;
    }

    public float getDiscountAmount() {
        return DiscountAmount;
    }

    public void setDiscountAmount(float DiscountAmount) {
        this.DiscountAmount = DiscountAmount;
    }

    public String getVendor() {
        return Vendor;
    }

    public void setVendor(String Vendor) {
        this.Vendor = Vendor;
    }

    public String getCallbackUrl() {
        return CallbackUrl;
    }

    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    public boolean isIsExcluded() {
        return IsExcluded;
    }

    public void setIsExcluded(boolean IsExcluded) {
        this.IsExcluded = IsExcluded;
    }

    public Date getPaymentDate() {
        return PaymentDate;
    }

    public void setPaymentDate(Date PaymentDate) {
        this.PaymentDate = PaymentDate;
    }

    public Date getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(Date CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    public ArrayList<Split> getSplits() {
        return Splits;
    }

    public void setSplits(ArrayList<Split> Splits) {
        this.Splits = Splits;
    }

    public float getNetValue() {
        return NetValue;
    }

    public void setNetValue(float NetValue) {
        this.NetValue = NetValue;
    }

    public boolean isIsSandbox() {
        return IsSandbox;
    }

    public void setIsSandbox(boolean IsSandbox) {
        this.IsSandbox = IsSandbox;
    }

    public boolean isIsSplitter() {
        return IsSplitter;
    }

    public void setIsSplitter(boolean IsSplitter) {
        this.IsSplitter = IsSplitter;
    }

    public ArrayList<Product> getProducts() {
        return Products;
    }

    public void setProducts(ArrayList<Product> Products) {
        this.Products = Products;
    }

    public int getIdSubscription() {
        return IdSubscription;
    }

    public void setIdSubscription(int IdSubscription) {
        this.IdSubscription = IdSubscription;
    }

    public String getPaymentInfo() {
        return PaymentInfo;
    }

    public void setPaymentInfo(String PaymentInfo) {
        this.PaymentInfo = PaymentInfo;
    }

    public String getCardBrand() {
        return CardBrand;
    }

    public void setCardBrand(String CardBrand) {
        this.CardBrand = CardBrand;
    }

    public int getApiVersion() {
        return ApiVersion;
    }

    public void setApiVersion(int ApiVersion) {
        this.ApiVersion = ApiVersion;
    }

}
