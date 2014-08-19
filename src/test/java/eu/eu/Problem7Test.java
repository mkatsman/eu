package eu.eu;

import junit.framework.Assert;

import org.junit.Test;

public class Problem7Test {
	@Test
	public void testPrimeUnder() {
		long prime = 0;
		Assert.assertEquals(13, Problem7.findNthPrime(6));
		Assert.assertEquals(17, Problem7.findNthPrime(7));
	}
}
