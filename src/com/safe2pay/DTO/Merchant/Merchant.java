package com.safe2pay.DTO.Merchant;

import com.safe2pay.DTO.Address.Address;
import com.safe2pay.DTO.Bank.BankData;
import java.util.ArrayList;

public class Merchant {

    private int Id;
    private String Name;
    private String CommercialName;
    private String Identity;
    private String ResponsibleName;
    private String ResponsibleIdentity;
    private String Email;
    private String TechName;
    private String TechIdentity;
    private String TechEmail;
    private String Token;
    private String SecretKey;
    private String TokenSandbox;
    private String SecretKeySandbox;
    private BankData BankData;
    private Address Address;
    private Configuration Configuration;
    private ArrayList<MerchantSplit> MerchantSplit;
    private Boolean IsRemoved;

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

    public String getCommercialName() {
        return CommercialName;
    }

    public void setCommercialName(String CommercialName) {
        this.CommercialName = CommercialName;
    }

    public String getIdentity() {
        return Identity;
    }

    public void setIdentity(String Identity) {
        this.Identity = Identity;
    }

    public String getResponsibleName() {
        return ResponsibleName;
    }

    public void setResponsibleName(String ResponsibleName) {
        this.ResponsibleName = ResponsibleName;
    }

    public String getResponsibleIdentity() {
        return ResponsibleIdentity;
    }

    public void setResponsibleIdentity(String ResponsibleIdentity) {
        this.ResponsibleIdentity = ResponsibleIdentity;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTechName() {
        return TechName;
    }

    public void setTechName(String TechName) {
        this.TechName = TechName;
    }

    public String getTechIdentity() {
        return TechIdentity;
    }

    public void setTechIdentity(String TechIdentity) {
        this.TechIdentity = TechIdentity;
    }

    public String getTechEmail() {
        return TechEmail;
    }

    public void setTechEmail(String TechEmail) {
        this.TechEmail = TechEmail;
    }

    public String getToken() {
        return Token;
    }

    public void setToken(String Token) {
        this.Token = Token;
    }

    public String getSecretKey() {
        return SecretKey;
    }

    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    public String getTokenSandbox() {
        return TokenSandbox;
    }

    public void setTokenSandbox(String TokenSandbox) {
        this.TokenSandbox = TokenSandbox;
    }

    public String getSecretKeySandbox() {
        return SecretKeySandbox;
    }

    public void setSecretKeySandbox(String SecretKeySandbox) {
        this.SecretKeySandbox = SecretKeySandbox;
    }

    public BankData getBankData() {
        return BankData;
    }

    public void setBankData(BankData BankData) {
        this.BankData = BankData;
    }

    public Address getAddress() {
        return Address;
    }

    public void setAddress(Address Address) {
        this.Address = Address;
    }

    public Configuration getConfiguration() {
        return Configuration;
    }

    public void setConfiguration(Configuration Configuration) {
        this.Configuration = Configuration;
    }

    public ArrayList<MerchantSplit> getMerchantSplit() {
        return MerchantSplit;
    }

    public void setMerchantSplit(ArrayList<MerchantSplit> MerchantSplit) {
        this.MerchantSplit = MerchantSplit;
    }

    public Boolean getIsRemoved() {
        return IsRemoved;
    }

    public void setIsRemoved(Boolean IsRemoved) {
        this.IsRemoved = IsRemoved;
    }

}
