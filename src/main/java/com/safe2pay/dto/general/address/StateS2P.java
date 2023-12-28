package com.safe2pay.dto.general.address;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

public class StateS2P {

    @JsonProperty("Id")
    public int id;
    @JsonProperty("IdCountry")
    public int idCountry;
    @JsonProperty("Initials")
    public String initials;
    @JsonProperty("Name")
    public Object name;

    @Builder
    public StateS2P(int id, int idCountry, String initials, Object name) {
        this.id = id;
        this.idCountry = idCountry;
        this.initials = initials;
        this.name = name;
    }

    public StateS2P() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }
}
