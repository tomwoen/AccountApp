package com.account_app_service;


import com.account_app_domain.Accounts;
import com.google.gson.Gson;

public class JsonWriter {

	private static String jsonStr;
	private String firstname;
	private String lastname;
	
	public void jWriter(String firstname, String lastname) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		
		Accounts account = new Accounts(firstname, lastname);
		
		Gson gsonObj = new Gson();
		setJsonStr(gsonObj.toJson(account));
		System.out.println(getJsonStr());
		
	}

	public static String getJsonStr() {
		return jsonStr;
	}

	public static void setJsonStr(String jsonStr) {
		JsonWriter.jsonStr = jsonStr;
	}
	
}
