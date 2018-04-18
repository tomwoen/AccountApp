package com.account_app_servicetest;

import static org.junit.Assert.*;


import org.junit.Test;

import com.account_app_service.JsonWriter;

public class JSONTest {
	
	JsonWriter jsonWriter = new JsonWriter();
	
	@Test
	public void jTest() {
		
		jsonWriter.jWriter();
		String expected = "{\"firstname\":\"Tom\",\"lastname\":\"Owen\",\"accountnumber\":0}";
		String JSONConsoleOutput = jsonWriter.getJsonStr();
		
		assertEquals(expected,JSONConsoleOutput);
		
	}

}
