package eu.eu;

public class EuUtils {
	/**
	 * Concatenate two arrays
	 * @param Array A
	 * @param Array B
	 * @return
	 */
	public static String[] concat(String[] A, String[] B) {
		   int aLen = A.length;
		   int bLen = B.length;
		   String[] C= new String[aLen+bLen];
		   System.arraycopy(A, 0, C, 0, aLen);
		   System.arraycopy(B, 0, C, aLen, bLen);
		   return C;
}

	/**checks whether an int is prime or not
	 * 
	 * @param n
	 * @return
	 */
	static boolean isPrimeMuchSlower(long n) {
		//any negative #,0 and 1
		if(n<2) return false;
	   
		for(int i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
	/**Finally, we know 2 is the “oddest” prime – it happens to be the only even prime number. Because of this, we need only check 2 separately, then traverse odd numbers up to the square root of n. In the end, our code will resemble this:
       found here: http://www.mkyong.com/java/how-to-determine-a-prime-number-in-java/
	 *
	 */
		//checks whether an int is prime or not.
	static	boolean isPrime(long n) {
		    //check if n is a multiple of 2
		    if (n%2==0) return false;
		    //if not, then just check the odds
		    for(int i=3;i*i<=n;i+=2) {
		        if(n%i==0)
		            return false;
		    }
		    return true;
		}
}