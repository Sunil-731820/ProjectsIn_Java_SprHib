package com.java.mvc.controller.controller;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dao.BankDao;
import dao.BankDaoImpl;
import model.Bank;

@Controller
public class HomeController {
	@Autowired
	BankDaoImpl dao;
	
	
	 @RequestMapping(value = "/newBankAccount", method = RequestMethod.GET)
	 public ModelAndView addbank(ModelAndView model) {
		 int accno = dao.generateAccountNo();
		 Bank bank = new Bank();
		 bank.setAccountNo(accno);
		 model.addObject(bank); 
		 model.setViewName("bankform");
		 return model;
	 }

	 @RequestMapping(value="/savebank", method = RequestMethod.POST)
	 public ModelAndView savebank(@ModelAttribute Bank bank) throws ClassNotFoundException, SQLException {
		 dao.addBank(bank);
		 return new ModelAndView("redirect:/");
	 }
	
	 @RequestMapping(value = "/deletebank", method = RequestMethod.GET)
	 public ModelAndView deleteEmploy(HttpServletRequest request) {
	     int accountNo = Integer.parseInt(request.getParameter("accountNo"));
	     dao.deleteBank(accountNo);
	     return new ModelAndView("redirect:/");
	 }
	 
//	 
//	 @RequestMapping(value = "/searchBank", method = RequestMethod.GET)
//	 public ModelAndView searchBank(HttpServletRequest request) {
//	 int accountNo = Integer.parseInt(request.getParameter("accountNo"));
//	 dao.searchBank(accountNo);
//	 return new ModelAndView("banksearchform");
//	 }
	 
	 @RequestMapping(value = "/updatebank", method = RequestMethod.POST)
	 public ModelAndView updatebank(@ModelAttribute Bank bank) {
		 dao.updateBank(bank);
	     return new ModelAndView("redirect:/");
	 }
	
	 @RequestMapping(value="/editbank")
		public ModelAndView editBank(HttpServletRequest request) {
		    int accountNo = Integer.parseInt(request.getParameter("accountNo"));
		    Bank bank = dao.searchBank(accountNo);
		    ModelAndView model = new ModelAndView("banksearchform");
		    model.addObject("bank", bank);
		 
		    return model;
		}

	@RequestMapping(value="/")
	public ModelAndView listBank(ModelAndView model) {
	List<Bank> listBank = dao.showBank();
	model.addObject("listBank",listBank);
	model.setViewName("home");
	return model;
	}
	
}
