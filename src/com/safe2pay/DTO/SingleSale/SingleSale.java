package com.safe2pay.DTO.SingleSale;

import com.safe2pay.DTO.Customer.Customer;
import com.safe2pay.DTO.General.Product;
import com.safe2pay.DTO.Merchant.Merchant;
import com.safe2pay.DTO.Payment.PaymentMethod;
import com.safe2pay.DTO.SingleSale.SingleSalePayment;
import java.util.ArrayList;
import java.util.Date;

public class SingleSale {

    private Merchant Merchant;
    private Customer Customer;
    private int IdTransaction;
    private String SingleSaleHash;
    private String Reference;
    private String CallbackUrl;
    private String SingleSaleUrl;
    private String BankSplipUrl;
    private String DueDate;
    private String ExpirationDate;
    private String CreatedDate;
    private double Amount;
    private double DiscountAmount;
    private double PenaltyAmount;
    private double InterestAmount;
    private ArrayList<String> Emails;
    private ArrayList<String> Messages;
    private String Instruction;
    private boolean IsExcluded;
    private SingleSalePayment Payment;
    private ArrayList<Product> Products;
    private ArrayList<SingleSalePaymentMethod> PaymentMethods;
    private int IdSubscription;

    public Merchant getMerchant() {
        return Merchant;
    }

    public void setMerchant(Merchant Merchant) {
        this.Merchant = Merchant;
    }

    public Customer getCustomer() {
        return Customer;
    }

    public void setCustomer(Customer Customer) {
        this.Customer = Customer;
    }

    public int getIdTransaction() {
        return IdTransaction;
    }

    public void setIdTransaction(int IdTransaction) {
        this.IdTransaction = IdTransaction;
    }

    public String getSingleSaleHash() {
        return SingleSaleHash;
    }

    public void setSingleSaleHash(String SingleSaleHash) {
        this.SingleSaleHash = SingleSaleHash;
    }

    public String getReference() {
        return Reference;
    }

    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    public String getCallbackUrl() {
        return CallbackUrl;
    }

    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    public String getSingleSaleUrl() {
        return SingleSaleUrl;
    }

    public void setSingleSaleUrl(String SingleSaleUrl) {
        this.SingleSaleUrl = SingleSaleUrl;
    }

    public String getBankSplipUrl() {
        return BankSplipUrl;
    }

    public void setBankSplipUrl(String BankSplipUrl) {
        this.BankSplipUrl = BankSplipUrl;
    }

    public String getDueDate() {
        return DueDate;
    }

    public void setDueDate(String DueDate) {
        this.DueDate = DueDate;
    }

    public String getExpirationDate() {
        return ExpirationDate;
    }

    public void setExpirationDate(String ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
    }

    public String getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(String CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double Amount) {
        this.Amount = Amount;
    }

    public double getDiscountAmount() {
        return DiscountAmount;
    }

    public void setDiscountAmount(double DiscountAmount) {
        this.DiscountAmount = DiscountAmount;
    }

    public double getPenaltyAmount() {
        return PenaltyAmount;
    }

    public void setPenaltyAmount(double PenaltyAmount) {
        this.PenaltyAmount = PenaltyAmount;
    }

    public double getInterestAmount() {
        return InterestAmount;
    }

    public void setInterestAmount(double InterestAmount) {
        this.InterestAmount = InterestAmount;
    }

    public ArrayList<String> getEmails() {
        return Emails;
    }

    public void setEmails(ArrayList<String> Emails) {
        this.Emails = Emails;
    }

    public ArrayList<String> getMessages() {
        return Messages;
    }

    public void setMessages(ArrayList<String> Messages) {
        this.Messages = Messages;
    }

    public String getInstruction() {
        return Instruction;
    }

    public void setInstruction(String Instruction) {
        this.Instruction = Instruction;
    }

    public boolean isIsExcluded() {
        return IsExcluded;
    }

    public void setIsExcluded(boolean IsExcluded) {
        this.IsExcluded = IsExcluded;
    }

    public SingleSalePayment getPayment() {
        return Payment;
    }

    public void setPayment(SingleSalePayment Payment) {
        this.Payment = Payment;
    }

    public ArrayList<Product> getProducts() {
        return Products;
    }

    public void setProducts(ArrayList<Product> Products) {
        this.Products = Products;
    }

    public ArrayList<SingleSalePaymentMethod> getPaymentMethods() {
        return PaymentMethods;
    }

    public void setPaymentMethods(ArrayList<SingleSalePaymentMethod> PaymentMethods) {
        this.PaymentMethods = PaymentMethods;
    }

    public int getIdSubscription() {
        return IdSubscription;
    }

    public void setIdSubscription(int IdSubscription) {
        this.IdSubscription = IdSubscription;
    }

}
