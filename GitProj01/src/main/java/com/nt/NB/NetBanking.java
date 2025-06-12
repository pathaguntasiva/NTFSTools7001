package com.nt.NB;

public class NetBanking
{
	//Net Banking Service
	public String myNetBanking(long srcAccount,long destAccount,String IFSC,double amount)
	{
		return amount+" is transfering from "+srcAccount+" to "+destAccount;
	}
	public String Transfermoney(long srcAccount,long destAccount,String IFSC,double amount)
	{
		return amount+" is transfering from "+srcAccount+" to "+destAccount+" using IMPS";
	}
}
