package com.account_app;

import com.google.gson.Gson;

public class JsonWriter {

	private static String jsonStr;
	
	public void jWriter() {
		
		Accounts account = new Accounts("Tom", "Owen");
		
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
