package in.gov.isro;

import static org.junit.Assert.*;

import org.junit.Test;

public class Calculator {

	@Test
	public void testmultiply() {
		Calculator calc = new Calculator();
		int result = calc.testmultiply(5,5); 
		assertEquals(25,result);
	}

}
