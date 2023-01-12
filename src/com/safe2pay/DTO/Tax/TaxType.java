package com.safe2pay.DTO.Tax;

public class TaxType {

    private int Id;
    private String Code;
    private String Name;

    public TaxType(String Code) {
        this.Code = Code;
    }

    public TaxType() {
    }
    
    

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

    public Object getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
}
