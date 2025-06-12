package com.nt.upi;

public class UPIPaymentOperations 
{
	//Performs the UPI Payment operations
	public String doPayment(long PhNo,double amount,String upid)
	{
		return amount+" amount is paid to @phone number :: "+PhNo;
	}
}
