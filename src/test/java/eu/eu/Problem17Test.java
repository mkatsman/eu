package eu.eu;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem17Test {
	
	@Test
	public void getLiteralsTest(){
     assertEquals("Zero".toLowerCase(), Problem17.getLiterals(0).toLowerCase());	
	 assertEquals("One".toLowerCase(), Problem17.getLiterals(1).toLowerCase());
	 assertEquals("Ten".toLowerCase(), Problem17.getLiterals(10).toLowerCase());
	 assertEquals("fifteen".toLowerCase(), Problem17.getLiterals(15).toLowerCase());
	 assertEquals("TwentyNine".toLowerCase(), Problem17.getLiterals(29).toLowerCase());
	 assertEquals("Thirty".toLowerCase(), Problem17.getLiterals(30).toLowerCase());
	 assertEquals("onehundred".toLowerCase(), Problem17.getLiterals(100).toLowerCase());
	 assertEquals("SixHundredNineteen".toLowerCase(), Problem17.getLiterals(619).toLowerCase());
	 
	 assertEquals("EightHundredZeroFive".toLowerCase(), Problem17.getLiterals(805).toLowerCase());
	 assertEquals("NineHundred".toLowerCase(), Problem17.getLiterals(900).toLowerCase());
	 assertEquals("NineHundredNinetyNine".toLowerCase(), Problem17.getLiterals(999).toLowerCase());
	 assertEquals("OneThousand".toLowerCase(), Problem17.getLiterals(1000).toLowerCase());
		
	}

}
