package com.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.project.impClasses.Account;
import com.project.repositary.AccountRepository;

public class AccountService {

	@Autowired
	private AccountRepository accrepo;
	
	public boolean createAccount(Account account) {
		try {
			accrepo.save(account);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	public List<Account> getAllAccounts() {
		return accrepo.findAll();
	}

	public Account findByEmailId(String email) {
		return accrepo.findByEmail(email);
	}

	public void deleteAccountBy(long id) {
		// TODO Auto-generated method stub
	accrepo.deleteById(id);	
	}
}
