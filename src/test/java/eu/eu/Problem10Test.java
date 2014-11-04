package eu.eu;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Problem10Test {


	@Test
	/**
	 * Make sure the algorithm matches given example.
	 */
	public void p10Test() {

		// make sure given example passes
		Assert.assertEquals(new Long(17),
				Long.valueOf(Problem10.sumOfPrimesUnderUpper(10, true)));
	}


	@Test
	public void testIsPrime() throws FileNotFoundException, IOException {

		CSVReader reader = new CSVReader();
		// read collection of primes from a file.
		String[] primes = reader.read("src/test/resources/primenumbers.txt");
		assertTrue(primes.length > 10);
		int counter = 0;
		for (String item : primes) {
			// skip spaces separated by comma
			if (item.isEmpty())
				continue;

			// make sure, each item in the list is qualified as prime
			Assert.assertTrue("Not a prime",
					EuUtils.isPrime(Integer.valueOf(item.trim())));
			counter++;

		}
		Assert.assertTrue(counter > 0);
	}

	
	@Test
	public void testIsNotPrime() {
		// negative cases
		Assert.assertFalse(EuUtils.isPrime(0));
		Assert.assertFalse(EuUtils.isPrime(1));
		Assert.assertFalse(EuUtils.isPrime(-2));
		Assert.assertFalse(EuUtils.isPrime(-5));
		Assert.assertFalse(EuUtils.isPrime(-1));

		Assert.assertFalse(EuUtils.isPrime(2000000));
		Assert.assertFalse(EuUtils.isPrime(6));
		Assert.assertFalse(EuUtils.isPrime(102));
	}

	
}