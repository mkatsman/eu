package eu.eu;

import static org.junit.Assert.*;


import org.junit.Test;

public class Problem17Test {
	

	@Test
	public void getLiteralTest(){
     assertEquals("Zero".toLowerCase(), Problem17.getLiteral(0).toLowerCase());	
	 assertEquals("One".toLowerCase(), Problem17.getLiteral(1).toLowerCase());
	 assertEquals("Ten".toLowerCase(), Problem17.getLiteral(10).toLowerCase());
	 assertEquals("fifteen".toLowerCase(), Problem17.getLiteral(15).toLowerCase());
	 assertEquals("TwentyNine".toLowerCase(), Problem17.getLiteral(29).toLowerCase());
	 assertEquals("Thirty".toLowerCase(), Problem17.getLiteral(30).toLowerCase());
	 assertEquals("onehundred".toLowerCase(), Problem17.getLiteral(100).toLowerCase());
	 assertEquals("SixHundredAndNineteen".toLowerCase(), Problem17.getLiteral(619).toLowerCase());
	 assertEquals("eighthundred".toLowerCase(), Problem17.getLiteral(800).toLowerCase());
	 
	 assertEquals("EightHundredAndFive".toLowerCase(), Problem17.getLiteral(805).toLowerCase());
	 assertEquals("NineHundred".toLowerCase(), Problem17.getLiteral(900).toLowerCase());
	 assertEquals("NineHundredAndNinetyNine".toLowerCase(), Problem17.getLiteral(999).toLowerCase());
	 assertEquals("OneThousand".toLowerCase(), Problem17.getLiteral(1000).toLowerCase());
		
	}
	
	@Test
	public void getOneHundredLiteralTest(){
		assertEquals("onehundred".toLowerCase(), Problem17.getLiteral(100).toLowerCase());
		 assertEquals("",Problem17.mapTen.get(0));
	}
/**
 * This test executes sample given in the assignment
 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.	
 */
  @Test
  public void assignmentExampleTest(){
	  assertEquals(23,Problem17.getSingleLiteralCount(342));
	  assertEquals(20,Problem17.getSingleLiteralCount(115));
  }
}
