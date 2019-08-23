package com.safe2pay.DTO.Subscription;


import com.safe2pay.DTO.Customer.Customer;
import java.util.Date;

public class Subscription {

    private int Id;
    private int Plan;
    private String ChargeDate;
    private boolean IsSandbox;
    private Customer Customer;
    private Object SubscriptionObject;
    private String CallbackUrl;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getPlan() {
        return Plan;
    }

    public void setPlan(int Plan) {
        this.Plan = Plan;
    }

    public String getChargeDate() {
        return ChargeDate;
    }

    public void setChargeDate(String ChargeDate) {
        this.ChargeDate = ChargeDate;
    }

    public boolean isIsSandbox() {
        return IsSandbox;
    }

    public void setIsSandbox(boolean IsSandbox) {
        this.IsSandbox = IsSandbox;
    }

    public Customer getCustomer() {
        return Customer;
    }

    public void setCustomer(Customer Customer) {
        this.Customer = Customer;
    }

    public Object getSubscriptionObject() {
        return SubscriptionObject;
    }

    public void setSubscriptionObject(Object SubscriptionObject) {
        this.SubscriptionObject = SubscriptionObject;
    }

    public String getCallbackUrl() {
        return CallbackUrl;
    }

    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }
}
