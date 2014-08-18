package eu.eu;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import junit.framework.Assert;

import org.junit.Test;

public class Problem10Test {

	@Test
	/**
	 * Make sure the algorithm matches given example.
	 */
	public void p10Test() {
		Assert.assertEquals(new Long(17),
				Long.valueOf(Problem10.sumOfPrimesUnderUpper(10)));
		Assert.assertEquals(new Long(0),
				Long.valueOf(Problem10.sumOfPrimesUnderUpper(0)));
	}

	@Test
	public void testIsPrime() throws FileNotFoundException, IOException {
		

		
		CSVReader reader = new CSVReader();
		// read collection of primes from a file.
		String[] primes = reader.read("src/test/resources/primenumbers.txt");
		assertTrue(primes.length > 10);

		for (String item : primes) {
			// skip spaces separated by comma
			if (item.isEmpty())
				continue;

			// make sure, each item in the list is qualified as prime
			Assert.assertTrue(EuUtils.isPrime(Integer.valueOf(item.trim())));

		}
	}

	@Test
	public void testIsNotPrime() {
		// negative cases
		Assert.assertFalse(EuUtils.isPrime(0));
		Assert.assertFalse(EuUtils.isPrime(1));
		
		Assert.assertFalse(EuUtils.isPrime(2000000));
		Assert.assertFalse(EuUtils.isPrime(6));
		Assert.assertFalse(EuUtils.isPrime(102));
	}
}