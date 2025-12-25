package com.app.repository;

import java.util.List;

import com.app.model.Account;

public interface HomerepoI 
{
	public void addBank(Account account);
	
	public List<Account> getList();
}
