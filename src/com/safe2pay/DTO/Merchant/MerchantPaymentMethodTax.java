package com.safe2pay.DTO.Merchant;

import com.safe2pay.DTO.Tax.TaxType;
import java.math.*;

public class MerchantPaymentMethodTax
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
	private int IdMerchantPaymentMethod;
	public final int getIdMerchantPaymentMethod()
	{
		return IdMerchantPaymentMethod;
	}
	public final void setIdMerchantPaymentMethod(int value)
	{
		IdMerchantPaymentMethod = value;
	}
	private int InitialInstallment;
	public final int getInitialInstallment()
	{
		return InitialInstallment;
	}
	public final void setInitialInstallment(int value)
	{
		InitialInstallment = value;
	}
	private int EndInstallment;
	public final int getEndInstallment()
	{
		return EndInstallment;
	}
	public final void setEndInstallment(int value)
	{
		EndInstallment = value;
	}
	private BigDecimal Amount = new BigDecimal(0);
	public final BigDecimal getAmount()
	{
		return Amount;
	}
	public final void setAmount(BigDecimal value)
	{
		Amount = value;
	}
	private TaxType TaxType;
	public final TaxType getTaxType()
	{
		return TaxType;
	}
	public final void setTaxType(TaxType value)
	{
		TaxType = value;
	}
}