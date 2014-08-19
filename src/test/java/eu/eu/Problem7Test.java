package eu.eu;

import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;

import junit.framework.Assert;

import org.junit.Test;

public class Problem7Test {
	@Test
	public void testPrimeUnder() {
		long prime = 0;
		Assert.assertEquals(13, Problem7.findNthPrime(6));
		Assert.assertEquals(17, Problem7.findNthPrime(7));
	}
	@Test
	public void TestSequentialPrimeIndexes() throws FileNotFoundException, IOException {

			CSVReader reader = new CSVReader();
			// read collection of primes from a file.
			String[] primes = reader.read("src/test/resources/smallPrimes.txt");
			assertTrue(primes.length > 10);
			int counter = 0;

			for (String item : primes) {
				// skip spaces separated by comma
				if (item.isEmpty())
					continue;

				// make sure, each item in the list is qualified as prime
			
					if	(EuUtils.isPrime(Long.valueOf(item.trim())));{
						counter++;
						Assert.assertEquals(Long.valueOf(item.trim()),new Long(Problem7.findNthPrime(counter)));
					}

			}
			Assert.assertTrue(counter > 20);
		}

	}

