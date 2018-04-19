package com.account_app_service;

import java.util.Map;

import com.account_app_domain.Accounts;

public class MapReader {

	public int read(String name, Map<Integer, Accounts> accounts) {
		
	
		return (int)accounts.values().stream().filter(Accounts -> name.equals(Accounts.firstName())).count();
	}

}
