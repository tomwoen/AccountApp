package com.account_app;

import com.google.gson.Gson;

public class JsonWriter {

	public static void main(String args []) {
		
		Accounts account = new Accounts("Tom", "Owen");
		
		Gson gsonObj = new Gson();
		String jsonStr = gsonObj.toJson(account);
		System.out.println(jsonStr);
		
		
	}
	
}
