package com.account_app_servicetest;

import org.junit.Test;

import com.account_app_domain.Accounts;
import com.account_app_service.MapReader;
import com.account_app_service.Services;

import junit.framework.Assert;

public class MapReaderTest {
	
	private MapReader mapRead;
	private Accounts accounts;
	private Services services;

	@Test
	public void test() {
	
	services = new Services();
	accounts = new Accounts("Tom","Owen");
	services.addAccount(accounts);
	accounts = new Accounts("Tom", "Heseltine");
	services.addAccount(accounts);
	
	
	mapRead = new MapReader();
	int expectedValue = 2;
	int actualValue = mapRead.read("Tom",services.getAccounts());
	Assert.assertEquals(expectedValue, actualValue);
		
	}

}
