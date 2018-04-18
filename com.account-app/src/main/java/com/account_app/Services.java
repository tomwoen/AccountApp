package com.account_app;

import java.util.HashMap;
import java.util.Map;

public class Services {
	
	private Map<Integer, Accounts> accounts;
	
	public Services() {
		
		super();
		this.accounts = new HashMap<Integer, Accounts>();
		
	}
	
	public void addAccount (Accounts account) {
		
		this.accounts.put(account.getAccountNumber(),account);
	}
	
	public Accounts retrieveAccount (int accountnumber) {
		
		return this.accounts.get(accountnumber);
		
	}
	
	public Map<Integer, Accounts> getAccounts() {
		
		return accounts;
	}
	

}
