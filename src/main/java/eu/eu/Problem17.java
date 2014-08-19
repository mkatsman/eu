package eu.eu;

import java.util.HashMap;
import java.util.Map;

/**
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?


 * @author mkatsman
 *
 */
public class Problem17 {

	public static void main(String[] args){
		 getLiteralCount(5);		
       getLiteralCount(1000);		

	}
	
	static Map<Integer, String> mapSingle = new HashMap<Integer, String>();
	static Map<Integer, String> mapTeen = new HashMap<Integer, String>();
	static Map<Integer, String> mapTen = new HashMap<Integer, String>();
	String hundred = "hundred";

	String thousand = "thousand";

	static {
		mapSingle.put(0, "");
		mapSingle.put(1, "one");
		mapSingle.put(2, "two");
		mapSingle.put(3, "three");
		mapSingle.put(4, "four");
		mapSingle.put(5, "five");
		mapSingle.put(6, "six");
		mapSingle.put(7, "seven");
		mapSingle.put(8, "eight");
		mapSingle.put(9, "nine");

		
		mapTeen.put(10, "ten");
		mapTeen.put(11, "eleven");
		mapTeen.put(12, "twelve");
		mapTeen.put(13, "thirteen");
		mapTeen.put(14, "fourteen");
		mapTeen.put(15, "fifteen");
		mapTeen.put(16, "sixteen");
		mapTeen.put(17, "seventeen");
		mapTeen.put(18, "eighteen");
		mapTeen.put(19, "nineteen");

		mapTen.put(0, new String());
		mapTen.put(20, "twenty");
		mapTen.put(30, "thirty");
		mapTen.put(40, "forty");
		mapTen.put(50, "fifty");
		mapTen.put(60, "sixty");
		mapTen.put(70, "seventy");
		mapTen.put(80, "eighty");
		mapTen.put(90, "ninety");

	}

	public static String getLiteral
	(Integer n) {
		String result = "";
		if (n == 0)
			return "zero";
		if (n == 1000)
			return "onethousand";
		
		
		if (0 < n && n < 10) {
			result = mapSingle.get(n);

		} else if (10 <= n && n < 100) {
			result = result + getTensLiteral(n);

		}

		else if (100 <= n && n < 1000) {
			result = getHundredsLiteral(n);

		}
		if (n > 0 && result.toLowerCase().endsWith("zero")) {

			// get rid of something like eighthundredzero.
			// strip off zero
			result = result.substring(0, result.length() - 4);
		}
		return result;

	}

	public static String getHundredsLiteral(Integer n) {

		String result = new String();
		int hundreds = n / 100;

		int tens = (n - (hundreds * 100)) / 10;
		int singles = n - (hundreds * 100) - (tens * 10);

		result = result + mapSingle.get(hundreds) + "hundred";
		result = result + getTensLiteral(tens*10 + singles);

		return result;

	}

	public static String getTensLiteral(Integer n) {
		String result = new String();
		int tens = n / 10;
		int singles = n - (tens * 10);

		if (tens == 1) {
			result = result + mapTeen.get(tens*10 + singles);
		} else {
			result = result + mapTen.get(tens * 10) + mapSingle.get(singles);
		}
		return result;
	}	
	public static long getLiteralCount(Integer n){
		long cnt = 0;
		for(int i = 1; i <= n; i++){
			cnt = cnt+ getLiteral(i).length();
		}
		System.out.println("Total string length for numbers from 1 to "+ n +" is " + cnt);
	
	 return cnt;
	}
}
