package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.controller.Homecontroller;
import com.app.model.Account;
import com.app.repository.HomerepoI;

@Service
public class Homeservice implements HomeserviceI
{

    private final Homecontroller homecontroller;
	@Autowired
	HomerepoI rs;

    Homeservice(Homecontroller homecontroller) {
        this.homecontroller = homecontroller;
    }

	@Override
	public void addAccount(Account a) {
		
		rs.addBank(a);
		
	}

	@Override
	public Account depositebalance(int accno, int amount) {
		List<Account> list= rs.getList();
		
		for(Account ac :list)
		{
			if(ac.getAccno()==accno)
			{
				ac.setBalance(ac.getBalance()+amount);
				return ac;
			}
		}
		
		return null;
	}

	@Override
	public Account withdrawbalance(int accno, int amount) {
		List<Account> list =rs.getList();
		for(Account ac:list)
		{
			if(ac.getAccno()==accno)
			{
				ac.setBalance(ac.getBalance()-amount);
				return ac;
			}
		}
		return null;
	}

	@Override
	public Account showBAlance(int accno) {
		List<Account> list=rs.getList();
		for(Account ac:list)
		{
			if(ac.getAccno()==accno)
			{
				return ac;
			}
		}
		return null;
	}

	@Override
	public Account deleteAcc(int accno) {
		Account account=null;
		List<Account> list =rs.getList();
		for(Account ac:list)
		{
			if(ac.getAccno()==accno)
			{
				
				account=ac;
			}
		}
		if(account!=null) {
		list.remove(account);
		System.out.println(list);
	
		
		}
		return account;
	}
	
	

	
	
	
		
		
		
		
	

}
