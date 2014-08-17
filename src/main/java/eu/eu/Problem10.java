package eu.eu;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * 
 * Find the sum of all the primes below two million.
 * 
 */
public class Problem10 {

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}

	public static int sumOfPrimes(int upper){
		
		int total =0;
		for(int i=2; i<=upper; i++)
		{
			if (isPrime(i)) total++;
		}
		return total;
	
		
	}
	//checks whether an int is prime or not.
	static boolean isPrime(int n) {
	    for(int i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
}