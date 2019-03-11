package com.cg.banking.controllers;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.cg.banking.beans.Account;
import com.cg.banking.exceptions.AccountNotFoundException;
import com.cg.banking.exceptions.BankingServicesDownException;
import com.cg.banking.services.BankingServices;

@Controller
public class BankingServicesController {
	@Autowired
	BankingServices bankingServices;

	@RequestMapping("/openAccount")
	public ModelAndView registerAssociate(@Valid@ModelAttribute Account account,BindingResult result) {
		if(result.hasErrors()) return new ModelAndView("registrationPage");
		account = bankingServices.openAccount(account);
		return new ModelAndView("registrationSuccessPage","account",account);
	}
	
	@RequestMapping("/accountDetails")
	public ModelAndView getAssociateDetails(@RequestParam long accountNo) throws AccountNotFoundException,BankingServicesDownException{
		Account account = bankingServices.getAccountDetails(accountNo);
		return new ModelAndView("findAccountDetailsPage","account",account);
	}
}
