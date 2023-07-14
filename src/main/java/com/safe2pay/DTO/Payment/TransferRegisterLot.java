package com.safe2pay.DTO.Payment;

import com.safe2pay.DTO.Transference.TransferRegister;
import java.util.*;
import java.math.*;

public class TransferRegisterLot
{
	private int Id;
	public final int getId()
	{
		return Id;
	}
	public final void setId(int value)
	{
		Id = value;
	}

	private int IdMerchantRequester;
	public final int getIdMerchantRequester()
	{
		return IdMerchantRequester;
	}
	public final void setIdMerchantRequester(int value)
	{
		IdMerchantRequester = value;
	}
	private int IdTransaction;
	public final int getIdTransaction()
	{
		return IdTransaction;
	}
	public final void setIdTransaction(int value)
	{
		IdTransaction = value;
	}
	private BigDecimal AmountLot = new BigDecimal(0);
	public final BigDecimal getAmountLot()
	{
		return AmountLot;
	}
	public final void setAmountLot(BigDecimal value)
	{
		AmountLot = value;
	}
	private BigDecimal AmountTax = new BigDecimal(0);
	public final BigDecimal getAmountTax()
	{
		return AmountTax;
	}
	public final void setAmountTax(BigDecimal value)
	{
		AmountTax = value;
	}
	private boolean IsRelease;
	public final boolean getIsRelease()
	{
		return IsRelease;
	}
	public final void setIsRelease(boolean value)
	{
		IsRelease = value;
	}
	private boolean IsUseCheckingAccount;
	public final boolean getIsUseCheckingAccount()
	{
		return IsUseCheckingAccount;
	}
	public final void setIsUseCheckingAccount(boolean value)
	{
		IsUseCheckingAccount = value;
	}
	private boolean IsProcessed;
	public final boolean getIsProcessed()
	{
		return IsProcessed;
	}
	public final void setIsProcessed(boolean value)
	{
		IsProcessed = value;
	}
	private Date CreatedDate;
	public final Date getCreatedDate()
	{
		return CreatedDate;
	}
	public final void setCreatedDate(Date value)
	{
		CreatedDate = value;
	}
	private int IdUserRelease;
	public final int getIdUserRelease()
	{
		return IdUserRelease;
	}
	public final void setIdUserRelease(int value)
	{
		IdUserRelease = value;
	}
	private int IdUserCancel;
	public final int getIdUserCancel()
	{
		return IdUserCancel;
	}
	public final void setIdUserCancel(int value)
	{
		IdUserCancel = value;
	}
	private ArrayList<TransferRegister> TransferRegisters;
	public final ArrayList<TransferRegister> getTransferRegisters()
	{
		return TransferRegisters;
	}
	public final void setTransferRegisters(ArrayList<TransferRegister> value)
	{
		TransferRegisters = value;
	}
	private String BankSlipUrl;
	public final String getBankSlipUrl()
	{
		return BankSlipUrl;
	}
	public final void setBankSlipUrl(String value)
	{
		BankSlipUrl = value;
	}
}