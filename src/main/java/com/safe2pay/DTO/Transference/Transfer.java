package com.safe2pay.DTO.Transference;

import java.util.ArrayList;
import java.util.Date;

public class Transfer {

    private int Id;
    private int Sequence;
    private float Amount;
    private Date CreatedDate;
    private String Filename;
    private String File;
    private ArrayList<TransferRegister> TransferRegister;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getSequence() {
        return Sequence;
    }

    public void setSequence(int Sequence) {
        this.Sequence = Sequence;
    }

    public float getAmount() {
        return Amount;
    }

    public void setAmount(float Amount) {
        this.Amount = Amount;
    }

    public Date getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(Date CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    public String getFilename() {
        return Filename;
    }

    public void setFilename(String Filename) {
        this.Filename = Filename;
    }

    public String getFile() {
        return File;
    }

    public void setFile(String File) {
        this.File = File;
    }

    public ArrayList<TransferRegister> getTransferRegister() {
        return TransferRegister;
    }

    public void setTransferRegister(ArrayList<TransferRegister> TransferRegister) {
        this.TransferRegister = TransferRegister;
    }
    
    
}
