package com.safe2pay.DTO.Payment;


public class Gateway {

    private int Id;
    private String Code;
    private String Name;
    private int ReleaseDays;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getReleaseDays() {
        return ReleaseDays;
    }

    public void setReleaseDays(int ReleaseDays) {
        this.ReleaseDays = ReleaseDays;
    }

}
