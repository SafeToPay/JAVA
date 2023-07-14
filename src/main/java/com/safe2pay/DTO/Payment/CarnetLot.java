package com.safe2pay.DTO.Payment;

import com.safe2pay.DTO.Merchant.Merchant;
import com.safe2pay.DTO.Transactions.Transaction;
import java.util.ArrayList;
import java.util.Date;

public class CarnetLot {

    private int Id;
    private int IdMerchant;
    private Merchant Merchant;
    private String JsonGzip;
    private String Identifier;
    private String CallbackUrl;
    private boolean IsProcessed;
    private Date CreatedDate;
    private ArrayList<Transaction> Items;
    private ArrayList<CarnetItems> Carnets;
    private int ApiVersion;

    public CarnetLot() {
        
        this.Items =  new ArrayList<>();
    }
    
    

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getIdMerchant() {
        return IdMerchant;
    }

    public void setIdMerchant(int IdMerchant) {
        this.IdMerchant = IdMerchant;
    }

    public Merchant getMerchant() {
        return Merchant;
    }

    public void setMerchant(Merchant Merchant) {
        this.Merchant = Merchant;
    }

    public String getJsonGzip() {
        return JsonGzip;
    }

    public void setJsonGzip(String JsonGzip) {
        this.JsonGzip = JsonGzip;
    }

    public String getIdentifier() {
        return Identifier;
    }

    public void setIdentifier(String Identifier) {
        this.Identifier = Identifier;
    }

    public String getCallbackUrl() {
        return CallbackUrl;
    }

    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    public boolean isIsProcessed() {
        return IsProcessed;
    }

    public void setIsProcessed(boolean IsProcessed) {
        this.IsProcessed = IsProcessed;
    }

    public Date getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(Date CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    public ArrayList<Transaction> getItems() {
        return Items;
    }

    public void setItems(ArrayList<Transaction> Items) {
        this.Items = Items;
    }

    public ArrayList<CarnetItems> getCarnets() {
        return Carnets;
    }

    public void setCarnets(ArrayList<CarnetItems> Carnets) {
        this.Carnets = Carnets;
    }

    public int getApiVersion() {
        return ApiVersion;
    }

    public void setApiVersion(int ApiVersion) {
        this.ApiVersion = ApiVersion;
    }

}
