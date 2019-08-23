package com.safe2pay.DTO.Plan;

import com.safe2pay.DTO.Merchant.Merchant;
import java.util.Date;


    public class Plan
    {
        private int Id;
        private PlanFrequence PlanFrequence;
        private Merchant Merchant;
        private String Name;
        private String Description;
        private double Amount;
        private int SubscriptionLimit;
        private int DaysTrial;
        private int DaysToInactive;
        private int ChargeDay;
        private double SubscriptionTax;
        private boolean IsProRata;
        private boolean IsEnabled;
        private boolean IsImmediateCharge;
        private String CallbackUrl;
        private Date ExpirationDate;
        private Date CreatedDate;
        private Date ChangedDate;
        private int SubscriptionTotal;
        private Object Status;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public PlanFrequence getPlanFrequence() {
        return PlanFrequence;
    }

    public void setPlanFrequence(PlanFrequence PlanFrequence) {
        this.PlanFrequence = PlanFrequence;
    }

    public Merchant getMerchant() {
        return Merchant;
    }

    public void setMerchant(Merchant Merchant) {
        this.Merchant = Merchant;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double Amount) {
        this.Amount = Amount;
    }

    public int getSubscriptionLimit() {
        return SubscriptionLimit;
    }

    public void setSubscriptionLimit(int SubscriptionLimit) {
        this.SubscriptionLimit = SubscriptionLimit;
    }

    public int getDaysTrial() {
        return DaysTrial;
    }

    public void setDaysTrial(int DaysTrial) {
        this.DaysTrial = DaysTrial;
    }

    public int getDaysToInactive() {
        return DaysToInactive;
    }

    public void setDaysToInactive(int DaysToInactive) {
        this.DaysToInactive = DaysToInactive;
    }

    public int getChargeDay() {
        return ChargeDay;
    }

    public void setChargeDay(int ChargeDay) {
        this.ChargeDay = ChargeDay;
    }

    public double getSubscriptionTax() {
        return SubscriptionTax;
    }

    public void setSubscriptionTax(double SubscriptionTax) {
        this.SubscriptionTax = SubscriptionTax;
    }

    public boolean isIsProRata() {
        return IsProRata;
    }

    public void setIsProRata(boolean IsProRata) {
        this.IsProRata = IsProRata;
    }

    public boolean isIsEnabled() {
        return IsEnabled;
    }

    public void setIsEnabled(boolean IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    public boolean isIsImmediateCharge() {
        return IsImmediateCharge;
    }

    public void setIsImmediateCharge(boolean IsImmediateCharge) {
        this.IsImmediateCharge = IsImmediateCharge;
    }

    public String getCallbackUrl() {
        return CallbackUrl;
    }

    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    public Date getExpirationDate() {
        return ExpirationDate;
    }

    public void setExpirationDate(Date ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
    }

    public Date getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(Date CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    public Date getChangedDate() {
        return ChangedDate;
    }

    public void setChangedDate(Date ChangedDate) {
        this.ChangedDate = ChangedDate;
    }

    public int getSubscriptionTotal() {
        return SubscriptionTotal;
    }

    public void setSubscriptionTotal(int SubscriptionTotal) {
        this.SubscriptionTotal = SubscriptionTotal;
    }

    public Object getStatus() {
        return Status;
    }

    public void setStatus(Object Status) {
        this.Status = Status;
    }
        
        
    }
