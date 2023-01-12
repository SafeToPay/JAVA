package com.safe2pay.DTO.Customer;

import com.safe2pay.DTO.Address.Address;

public class Customer {

    private int Id;
    private String Name;
    private String Identity;
    private String Phone;
    private String Email;
    private Address Address;

    public Customer() {
    }

    public Customer(String Name, String Identity, String Email) {
        this.Name = Name;
        this.Identity = Identity;
        this.Email = Email;
    }

    public Customer(String Name, String Identity, String Phone, String Email, Address Address) {
        this.Name = Name;
        this.Identity = Identity;
        this.Phone = Phone;
        this.Email = Email;
        this.Address = Address;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getIdentity() {
        return Identity;
    }

    public void setIdentity(String Identity) {
        this.Identity = Identity;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Address getAddress() {
        return Address;
    }

    public void setAddress(Address Address) {
        this.Address = Address;
    }
}
