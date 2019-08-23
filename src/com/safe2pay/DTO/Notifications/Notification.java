package com.safe2pay.DTO.Notifications;

import com.safe2pay.DTO.Payment.PaymentMethod;
import com.safe2pay.DTO.Transactions.TransactionStatus;
import java.math.*;
import java.util.Date;

public class Notification
{
	private int IdTransaction;
	public final int getIdTransaction()
	{
		return IdTransaction;
	}
	public final void setIdTransaction(int value)
	{
		IdTransaction = value;
	}
	private int IdMerchant;
	public final int getIdMerchant()
	{
		return IdMerchant;
	}
	public final void setIdMerchant(int value)
	{
		IdMerchant = value;
	}
	private TransactionStatus TransactionStatus;
	public final TransactionStatus getTransactionStatus()
	{
		return TransactionStatus;
	}
	public final void setTransactionStatus(TransactionStatus value)
	{
		TransactionStatus = value;
	}
	private PaymentMethod PaymentMethod;
	public final PaymentMethod getPaymentMethod()
	{
		return PaymentMethod;
	}
	public final void setPaymentMethod(PaymentMethod value)
	{
		PaymentMethod = value;
	}
	private String Application;
	public final String getApplication()
	{
		return Application;
	}
	public final void setApplication(String value)
	{
		Application = value;
	}
	private String Vendor;
	public final String getVendor()
	{
		return Vendor;
	}
	public final void setVendor(String value)
	{
		Vendor = value;
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
	private Date PaymentDate = null;
	public final Date getPaymentDate()
	{
		return PaymentDate;
	}
	public final void setPaymentDate(Date value)
	{
		PaymentDate = value;
	}
	private Date IncluedDate = null;
	public final Date getIncluedDate()
	{
		return IncluedDate;
	}
	public final void setIncluedDate(Date value)
	{
		IncluedDate = value;
	}
	private int InstallmentQuantity;
	public final int getInstallmentQuantity()
	{
		return InstallmentQuantity;
	}
	public final void setInstallmentQuantity(int value)
	{
		InstallmentQuantity = value;
	}
	private String SecretKey;
	public final String getSecretKey()
	{
		return SecretKey;
	}
	public final void setSecretKey(String value)
	{
		SecretKey = value;
	}
	private BigDecimal TaxValue = null;
	public final BigDecimal getTaxValue()
	{
		return TaxValue;
	}
	public final void setTaxValue(BigDecimal value)
	{
		TaxValue = value;
	}
	private BigDecimal NetValue = null;
	public final BigDecimal getNetValue()
	{
		return NetValue;
	}
	public final void setNetValue(BigDecimal value)
	{
		NetValue = value;
	}
	private BigDecimal PaidValue = null;
	public final BigDecimal getPaidValue()
	{
		return PaidValue;
	}
	public final void setPaidValue(BigDecimal value)
	{
		PaidValue = value;
	}
	private String Reference;
	public final String getReference()
	{
		return Reference;
	}
	public final void setReference(String value)
	{
		Reference = value;
	}
	private String NotificationUrl;
	public final String getNotificationUrl()
	{
		return NotificationUrl;
	}
	public final void setNotificationUrl(String value)
	{
		NotificationUrl = value;
	}
}