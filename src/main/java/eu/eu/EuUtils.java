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
	static boolean isPrime(long n) {
		//any negative #,0 and 1
		if(n<2) return false;
	   
		for(int i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
}