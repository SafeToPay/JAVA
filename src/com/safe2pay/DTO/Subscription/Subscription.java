package com.safe2pay.DTO.Subscription;


import com.safe2pay.DTO.Customer.Customer;
import com.safe2pay.DTO.Plan.Plan;
import com.safe2pay.DTO.Plan.PlanFrequence;

import java.util.ArrayList;
import java.util.Date;

public class Subscription {

    private int Id;

    private Plan Plan;
    private int PaymentMethod;
    private Customer Customer;
    private String ChargeDate;
    private ArrayList<String> Emails;
    private String SubscriptionDate;
    private String Token;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Plan getIPlan() {
        return Plan;
    }

    public void setPlan(Plan Plan) {
        this.Plan = Plan;
    }

    public int getPaymentMethod() {
        return PaymentMethod;
    }

    public void setPaymentMethod(int PaymentMethod) {
        this.PaymentMethod = PaymentMethod;
    }

    public String getChargeDate() {
        return ChargeDate;
    }

    public void setChargeDate(String ChargeDate) {
        this.ChargeDate = ChargeDate;
    }

    public Customer getCustomer() {
        return Customer;
    }

    public void setCustomer(Customer Customer) {
        this.Customer = Customer;
    }

    public String getToken() {
        return Token;
    }

    public void setToken(String Token) {
        this.Token = Token;
    }

    public ArrayList<String> getEmails() {return Emails; }

    public void setEmails(ArrayList<String> Emails) {this.Emails = Emails;}

    public String getSubscriptionDate() {
        return SubscriptionDate;
    }
    public void setSubscriptionDate(String SubscriptionDate) {
        this.SubscriptionDate = SubscriptionDate;
    }

}
