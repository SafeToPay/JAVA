package com.safe2pay.DTO.Plan;

import java.util.Date;

public class Plan {
    private int Id;
    private int PlanOption;
    private int PlanFrequence;
    private int ChargeDay;
    private int DayOfWeek;
    private String Name;
    private String Description;
    private double Amount;
    private double SubscriptionTax;
    private int SubscriptionLimit;
    private boolean IsImediateCharge;
    private boolean IsProRata;
    private boolean IsChargeOverdue;
    private int DaysBeforeChargeDateExpiration;
    private int BillingCycle;
    private boolean IsEnabled;
    private String CallbackUrl;
    private int DaysBeforeCancel;
    private int DaysDue;
    private String Instruction;
    private double PenaltyAmount;
    private double InterestAmount;
    private String Message;
    private int DiscountType;
    private int DiscountDue;
    private double DiscountAmount;
    private int DaysChurn;
    private int DaysChunrAlert;
    private int DaysDelayAlert;
    private String ExpirationDate;

    private String CreatedDate;
    private String ChargedDate;
    private int SubscriptionTotal;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getPlanOption() {
        return PlanOption;
    }

    public void setPlanOption(int PlanOption) {
        this.PlanOption = PlanOption;
    }

    public int getPlanFrequence() {
        return PlanFrequence;
    }

    public void setPlanFrequence(int PlanFrequence) {
        this.PlanFrequence = PlanFrequence;
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

    public int getDayOfWeek() {
        return DayOfWeek;
    }

    public void setDayOfWeek(int DayOfWeek) {
        this.DayOfWeek = DayOfWeek;
    }

    public int getSubscriptionLimit() {
        return SubscriptionLimit;
    }

    public void setSubscriptionLimit(int SubscriptionLimit) {
        this.SubscriptionLimit = SubscriptionLimit;
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

    public boolean isIsImediateCharge() {
        return IsImediateCharge;
    }

    public void setIsImediateCharge(boolean IsImediateCharge) {
        this.IsImediateCharge = IsImediateCharge;
    }

    public String getCallbackUrl() {
        return CallbackUrl;
    }

    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
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

    public String getChargedDate() {
        return ChargedDate;
    }

    public void setChargedDate(String ChargedDate) {
        this.ChargedDate = ChargedDate;
    }

    public int getSubscriptionTotal() {
        return SubscriptionTotal;
    }

    public void setSubscriptionTotal(int SubscriptionTotal) {
        this.SubscriptionTotal = SubscriptionTotal;
    }

    public int getDaysBeforeChargeDateExpiration() {
        return DaysBeforeChargeDateExpiration;
    }

    public void setDaysBeforeChargeDateExpiration(int DaysBeforeChargeDateExpiration) {
        this.DaysBeforeChargeDateExpiration = DaysBeforeChargeDateExpiration;
    }

    public int getBillingCycle() {
        return BillingCycle;
    }

    public void setBillingCycle(int BillingCycle) {
        this.BillingCycle = BillingCycle;
    }

    public int getDaysBeforeCancel() {
        return DaysBeforeCancel;
    }

    public void setDaysBeforeCancel(int DaysBeforeCancel) {
        this.DaysBeforeCancel = DaysBeforeCancel;
    }

    public int getDaysDue() {
        return DaysDue;
    }

    public void setDaysDue(int DaysDue) {
        this.DaysDue = DaysDue;
    }

    public String getInstruction() {
        return Instruction;
    }

    public void setInstruction(String Instruction) {
        this.Instruction = Instruction;
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

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public int getDiscountType() {
        return DiscountType;
    }

    public void setDiscountType(int DiscountType) {
        this.DiscountType = DiscountType;
    }

    public int getDiscountDue() {
        return DiscountDue;
    }

    public void setDiscountDue(int DiscountDue) {
        this.DiscountDue = DiscountDue;
    }

    public double getDiscountAmount() {
        return DiscountAmount;
    }

    public void setDiscountAmount(double DiscountAmount) {
        this.DiscountAmount = DiscountAmount;
    }

    public int getDaysChurn() {
        return DaysChurn;
    }

    public void setDaysChurn(int DaysChurn) {
        this.DaysChurn = DaysChurn;
    }

    public int getDaysChurnAlert() {
        return DaysChunrAlert;
    }

    public void setDaysChurnAlert(int DaysChurnAlert) {
        this.DaysChunrAlert = DaysChurnAlert;
    }

    public int getDaysDelayAlert() {
        return DaysDelayAlert;
    }

    public void setDaysDelayAlert(int DaysDelayAlert) {
        this.DaysDelayAlert = DaysDelayAlert;
    }

    public boolean getIsChargeOverdue() {
        return IsChargeOverdue;
    }

    public void setIsChargeOverdue(Boolean IsChargeOverdue) {
        this.IsChargeOverdue = IsChargeOverdue;
    }
}
