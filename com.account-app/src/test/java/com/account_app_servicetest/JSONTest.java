package com.account_app_servicetest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.account_app_service.JsonWriter;

public class JSONTest {
	
	
	JsonWriter jsonWriter;
		
	@Test
	public void jTest() {
		
		
		jsonWriter = new JsonWriter(); 
		jsonWriter.jWriter("Tom","Owen");
		String expected = "{\"firstname\":\"Tom\",\"lastname\":\"Owen\",\"accountnumber\":0}";
		String JSONConsoleOutput = jsonWriter.getJsonStr();
		
		assertEquals(expected,JSONConsoleOutput);
		
	}

}
