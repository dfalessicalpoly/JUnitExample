package test;

import logic.BasicCalculations;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestDivision {
	
	@Test
	public void testDivision() {
		
		BasicCalculations b = new BasicCalculations();
		double output = b.PerfectDivision(11, 10);
		assertEquals((double) 2, output, 1);
		
	}
	
	@Test
	public void testDivisionByNegative() {
		
		BasicCalculations b = new BasicCalculations();
		double output = b.PerfectDivision(10, 10);
		assertEquals((double) -2, output, 0);
		
	}

}
