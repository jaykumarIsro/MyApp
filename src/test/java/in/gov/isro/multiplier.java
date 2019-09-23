package in.gov.isro;

import junit.framework.TestCase;

public class multiplier extends TestCase {
	@Test
	Calculator calc = new Calculator();
			int result = calc (5,5);
			assertEquals(25,result);

}
