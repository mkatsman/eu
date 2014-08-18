package eu.eu;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * 
 * Find the sum of all the primes below two million.
 * 
 */
public class Problem10 {

	public static void main(String[] args) {
		System.out.println(Problem10.sumOfPrimesUnderUpper(1000000));
	}

	public static long sumOfPrimesUnderUpper(int upper){
		
		long total =0;
		long start = System.currentTimeMillis();
		float totalTime = 0;
		for(int i=2; i<=upper; i++)
			
		{
			if(i%100000==0){
				//print current item and the time it took to process it.
				//This will increase he total time of execution, but it is entertaining.
			    totalTime = (System.currentTimeMillis() -start);
				
			    System.out.println("current "+i +" total time in milliseconds: "+ totalTime );
				
			}
			if (EuUtils.isPrime(i)) 
				total = total+i;
		}
		
		System.out.println("total time in milliseconds is: "+ totalTime);	
		return total;
	
		
	}
}