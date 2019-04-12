package test;

import logic.BasicCalculations;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestSum {
	
	@Test
	public void testSum() {
		
		BasicCalculations b = new BasicCalculations();
		int output = b.PerfectSum(11, 10);
		assertEquals(21, output);
		
	}
}
