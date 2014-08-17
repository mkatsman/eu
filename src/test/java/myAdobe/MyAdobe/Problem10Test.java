package myAdobe.MyAdobe;

import static org.junit.Assert.*;

import org.junit.Test;

import eu.eu.Problem10;



public class Problem10Test {
	
	@Test
	public void testIsPrime(){
		assertTrue(Problem10.isPrime(7));
		assertTrue("Not a prime Number", Problem10.isPrime(5479));
	}
	

}
