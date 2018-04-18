package com.account_app;

public class Accounts {
	
	private static int uniquenumber = 0;
	private String firstname;
	private String lastname;
	private int accountnumber;
	
	public Accounts (String firstname, String lastname) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.accountnumber = Accounts.uniquenumber;
		Accounts.uniquenumber++;
		
	
	}
		
	public String firstName() {
		
		return firstname;
	}
	
	public void setFirstName(String firstname) {
		
		this.firstname = firstname;
	}
	
	public String lastName() {
		
		return lastname;
			
	}
	
	public void setLastName(String lastname) {
		
		this.lastname = lastname;
		
	}
	
	public int getAccountNumber() {
		
		return accountnumber;
		
	}
	
	public void setAccountNumber(int accountnumber) {
		
		this.accountnumber = accountnumber;
		
	}

}
