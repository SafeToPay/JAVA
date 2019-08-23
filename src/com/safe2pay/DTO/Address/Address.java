package com.safe2pay.DTO.Address;

public class Address {

    private String ZipCode;
    private String Street;
    private String Number;
    private String District;
    private String CityName;
    private String StateInitials;
    private String Complement;

    private String CountryName;

    private City City;
    private State State;
    private Country Country;

    public Address() {
    }

    public Address(String ZipCode, String Street, String Number, String District, String CityName, String StateInitials, String Complement, String CountryName) {
        this.ZipCode = ZipCode;
        this.Street = Street;
        this.Number = Number;
        this.District = District;
        this.CityName = CityName;
        this.StateInitials = StateInitials;
        this.Complement = Complement;
        this.CountryName = CountryName;
    }

  

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String ZipCode) {
        this.ZipCode = ZipCode;
    }

    public String getStreet() {
        return Street;
    }

    public String getComplement() {
        return Complement;
    }

    public void setComplement(String Complement) {
        this.Complement = Complement;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String Number) {
        this.Number = Number;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String District) {
        this.District = District;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    public String getStateInitials() {
        return StateInitials;
    }

    public void setStateInitials(String StateInitials) {
        this.StateInitials = StateInitials;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String CountryName) {
        this.CountryName = CountryName;
    }

    public City getCity() {
        return City;
    }

    public void setCity(City City) {
        this.City = City;
    }

    public State getState() {
        return State;
    }

    public void setState(State State) {
        this.State = State;
    }

    public Country getCountry() {
        return Country;
    }

    public void setCountry(Country Country) {
        this.Country = Country;
    }
}
