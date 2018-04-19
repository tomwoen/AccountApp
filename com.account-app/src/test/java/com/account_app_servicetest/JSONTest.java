package com.account_app_servicetest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.account_app_service.JsonWriter;

public class JSONTest {
	
	
	JsonWriter jsonWriter;
		
	@Before 
	
	public void setUp( ) {
		jsonWriter = new JsonWriter();
	}
	
	@Test
	public void jTest() {
		
		
		 
		jsonWriter.jWriter("Tom","Owen");		
		String firstoutput = "{\"firstname\":\"Tom\",\"lastname\":\"Owen\",\"accountnumber\":0}";
		String JSONConsoleOutput = jsonWriter.getJsonStr();
		
		assertEquals(firstoutput,JSONConsoleOutput);
		
		jsonWriter.jWriter("Phil", "Mitchell");
		String SecondJSONConsoleOutput = jsonWriter.getJsonStr();
		String SecondOutput = "{\"firstname\":\"Phil\",\"lastname\":\"Mitchell\",\"accountnumber\":1}";
		assertEquals(SecondOutput,SecondJSONConsoleOutput);
		
	}
	


}
