package com.account_app_service;

import java.util.Map;

import com.account_app_domain.Accounts;

public class MapReader {

	public int read(String name, Map<Integer, Accounts> accounts) {
		
		int count = 0;
		
		for (Accounts account : accounts.values()) {
			
			if (account.firstName().equals(name)) {
				count++;
			}
		}
		return count;
	}

}
