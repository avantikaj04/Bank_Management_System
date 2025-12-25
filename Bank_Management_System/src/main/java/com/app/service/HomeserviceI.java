package com.app.service;

import com.app.model.Account;

public interface HomeserviceI 
{
	public void addAccount(Account a);
	
	public Account depositebalance(int accno,int amount);
	
	public Account withdrawbalance(int accno,int amount);
	
	public Account showBAlance(int accno);
	
	public Account deleteAcc(int accno);
	
	

}
