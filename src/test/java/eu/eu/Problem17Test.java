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
	 assertEquals("SixHundredNineteen".toLowerCase(), Problem17.getLiteral(619).toLowerCase());
	 
	 assertEquals("EightHundredFive".toLowerCase(), Problem17.getLiteral(805).toLowerCase());
	 assertEquals("NineHundred".toLowerCase(), Problem17.getLiteral(900).toLowerCase());
	 assertEquals("NineHundredNinetyNine".toLowerCase(), Problem17.getLiteral(999).toLowerCase());
	 assertEquals("OneThousand".toLowerCase(), Problem17.getLiteral(1000).toLowerCase());
		
	}
	
	@Test
	public void getOneHundredLiteralTest(){
		assertEquals("onehundred".toLowerCase(), Problem17.getLiteral(100).toLowerCase());
		 assertEquals("",Problem17.mapTen.get(0));
	}
	

}
