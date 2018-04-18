package com.account_app;

import static org.junit.Assert.*;


import org.junit.Test;

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
