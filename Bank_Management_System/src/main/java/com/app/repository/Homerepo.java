package com.app.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.app.model.Account;


@Repository
public class Homerepo implements HomerepoI {
	
	List<Account> list = new ArrayList<Account>();

	@Override
	public void addBank(Account account) {
		list.add(account);
		System.out.println(list);
		
	}
	
	public List<Account>  getList()
	{
		return list;
	}

	
	
}
