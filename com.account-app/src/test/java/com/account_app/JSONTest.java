package com.account_app;

import static org.junit.Assert.*;


import org.junit.Test;

public class JSONTest {
	
	JsonWriter jwrite = new JsonWriter();
	
	@Test
	public void jTest() {
		
		jwrite.jWriter();
		String joutput = jwrite.getJsonStr();
		
		assertEquals("{\"firstname\":\"Tom\",\"lastname\":\"Owen\",\"accountnumber\":0}",joutput);
		
	}

}
