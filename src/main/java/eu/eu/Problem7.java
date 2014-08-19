package eu.eu;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
 * that the 6th prime is 13.
 * 
 * What is the 10 001st prime number?
 * 
 */
public class Problem7 {
	public static void main(String[] args) {
		long prime = 0;
		prime = Problem7.findNthPrime(6);
		prime = Problem7.findNthPrime(10001);
		
	}

	public static long findNthPrime(int n) {

		long start = System.currentTimeMillis();
		float totalTime = 0;
		long i = 0;
		long current = 2;
		while (true) {

			if (EuUtils.isPrime(current)) {
				i++;

			}
			if (i == n)
				break;
			current++;

		}
		totalTime = (System.currentTimeMillis() - start) ;
		
		System.out
		.println("The prime number for index " + n + " is " + current);
	
		System.out.println("total time in milli seconds is: " + totalTime);
		
		return current;

	}

}
