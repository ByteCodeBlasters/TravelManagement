package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.impClasses.Account;
import com.project.service.AccountService;


@RestController
@RequestMapping("/account")
@CrossOrigin("http://localhost:4200")
public class AccountController extends AccountService {
	@Autowired
	AccountService service;
	
	@PostMapping("/createAccount")
	public boolean CreateAccount(@RequestBody Account account) {
		return service.createAccount(account);
	}
	
	@GetMapping("/viewAccounts")
	public List<Account> allAccounts(){
		return service.getAllAccounts();
	}
	@GetMapping("/byEmail/{email}")
	public Account findbyEmail(@PathVariable("email") String email ){
		return service.findByEmailId(email);
	}
	
	@DeleteMapping("/delete/{deletingid}")
	public void deleteAccount(@PathVariable("deletingid") long id) {
		service.deleteAccountBy(id);
	}
}
