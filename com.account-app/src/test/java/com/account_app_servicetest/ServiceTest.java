package com.account_app_servicetest;

import static org.junit.Assert.*;


import org.junit.Test;

import com.account_app_domain.Accounts;
import com.account_app_service.Services;

public class ServiceTest {
	
	Services services = new Services();

	@Test
	public void testAddAccount() {
		
		Accounts testAccount = new Accounts("Tom","Owen");
		assertTrue(!services.getAccounts().containsKey(testAccount.getAccountNumber()));
		
		services.addAccount(testAccount);
		
		assertTrue(services.getAccounts().containsKey(testAccount.getAccountNumber()));
		
		assertTrue(services.getAccounts().get(testAccount.getAccountNumber()).equals(testAccount));

		
	}
	
	@Test
	public void testRetrieveAccount() {
		
		Accounts testAccount = new Accounts("Tom", "Owen");
		
		assertNull(services.retrieveAccount(testAccount.getAccountNumber()));
		
		services.addAccount(testAccount);
		
		assertTrue(testAccount.equals(services.retrieveAccount(testAccount.getAccountNumber())));
	}
	
}
