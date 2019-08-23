/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safe2pay.DTO.SingleSale;

/**
 *
 * @author lucas.silva
 */
public class SingleSalePaymentMethod {
    
    
    private int Id;
    private int IdSingleSale;
    private String CodePaymentMethod;
    private String PaymentMethod;

    public SingleSalePaymentMethod() {
    }

    public SingleSalePaymentMethod(String CodePaymentMethod) {
        this.CodePaymentMethod = CodePaymentMethod;
    }

   
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getIdSingleSale() {
        return IdSingleSale;
    }

    public void setIdSingleSale(int IdSingleSale) {
        this.IdSingleSale = IdSingleSale;
    }

    public String getCodePaymentMethod() {
        return CodePaymentMethod;
    }

    public void setCodePaymentMethod(String CodePaymentMethod) {
        this.CodePaymentMethod = CodePaymentMethod;
    }

    public String getPaymentMethod() {
        return PaymentMethod;
    }

    public void setPaymentMethod(String PaymentMethod) {
        this.PaymentMethod = PaymentMethod;
    }
    
    
    
}
