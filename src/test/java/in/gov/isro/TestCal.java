package in.gov.isro;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCal {

	@Test
	public void testadd() {
		Calculator calc = new Calculator();
		int result = calc.add(5, 6);
		assertEquals(11, result);
	}
	
	@Test
	public void testmultiply() {
		Calculator calc = new Calculator();
		int result = calc.multiply(5, 6);
		assertEquals(30, result);
	}
	
	@Test
	public void subtract() {
		Calculator calc = new Calculator();
		int result = calc.subtract(10, 6);
		assertEquals(4, result);	
	}
		
}
