package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.app.model.Account;
import com.app.service.HomeserviceI;

@Controller
public class Homecontroller
{
	@Autowired
	HomeserviceI hsi;
	@RequestMapping("/")
	public String preLogin()
	{
		return "login";
	}
	
	@RequestMapping("/welcome")
	public String preWelcome(@RequestParam("username")String username,@RequestParam("password")String password)
	{
		if(username.equals("admin") && password.equals("admin"))
		{
			return "welcome";
		}
		else {
			return "login";
		}
		
		
	}
	
	@RequestMapping("/create")
	public String preCreate()
	{
		return "register";
		
	}
	
	@RequestMapping("submit")
	public String create(@ModelAttribute Account acc)
	{
		hsi.addAccount(acc);
		return "welcome";
		
	}
	
	@RequestMapping("depo")
	public String predeposite()
	{
		return "deposite";
	}
	
	@RequestMapping("deposubmit")
	public String depositeAmount(@RequestParam("number")int number,@RequestParam("amount")int amount,ModelMap m)
	{
		Account account=hsi.depositebalance(number, amount);
		
		if(account!=null)
		{
			m.put("Data", account);
			return "success";
		}
		else {
			return "deposite";
			
		}
	}
	
	@RequestMapping("withdraw")
	public String reWithdraw()
	{
		return "withdraw";
	}
	
	@RequestMapping("withdrawsubmit")
	public String withdraw(@RequestParam("number")int number,@RequestParam("amount")int amount,ModelMap m)
	{
		
Account account=hsi.withdrawbalance(number, amount);
		
		if(account!=null)
		{
			m.put("Data", account);
			return "success";
		}
		else {
			return "withdraw";
			
		}
	}
	
	@RequestMapping("balance")
	public String preBAlance()
	{
		return "view";
	}
		
		
	@RequestMapping("submitview")
	public String showBAlance(@RequestParam("number")int number,ModelMap m)
	{
		Account account= hsi.showBAlance(number);
		
		if(account!=null)
		{
			m.put("Data", account);
			return "success";
			
		}
		else 
		{
			return "view";
			
		}
		
	}
	
	@RequestMapping("/delete")
	public String preDelete()
	{
		return "delete";
	}
	
	@RequestMapping("subdelete")
	public String Delete(@RequestParam("number")int number,ModelMap m)
	{
		Account account=hsi.deleteAcc(number);
		if(account!=null) 
		{
			m.put("Data", account);
			return "success";
			
		}
		else {
			return "delete";
		}
			
		
	}
		
		
	
	
		
		
		
	
	
	
	
}
