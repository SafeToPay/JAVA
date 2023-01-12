package com.safe2pay.DTO.General;

public class Product {

    private String Code;
    private String Description;
    private double UnitPrice;
    private double Quantity;

    public Product(String Code, String Description, double UnitPrice, double Quantity) {
        this.Code = Code;
        this.Description = Description;
        this.UnitPrice = UnitPrice;
        this.Quantity = Quantity;
    }
     

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(double UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    public double getQuantity() {
        return Quantity;
    }

    public void setQuantity(double Quantity) {
        this.Quantity = Quantity;
    }
}
