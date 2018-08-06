package romanNumerals;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumeralsTest {

	@Test
	public void testFourCharacterReplacement() {
		
		// test replacing IIII
		int charactersSaved = RomanNumerals.findMinimalRomanNumerals("MDLXIIII");
		assertEquals("Incorrect number of characters saved.", 2, charactersSaved);
		
		// test replacing XXXX
		charactersSaved = RomanNumerals.findMinimalRomanNumerals("MDCCCXXXXVI");
		assertEquals("Incorrect number of characters saved.", 2, charactersSaved);
		
		// test replacing CCCC
		charactersSaved = RomanNumerals.findMinimalRomanNumerals("MCCCCLXX");
		assertEquals("Incorrect number of characters saved.", 2, charactersSaved);
	}
	
	@Test
	public void testFiveCharacterReplacement() {
		
		// test replacing DCCCC
		int charactersSaved = RomanNumerals.findMinimalRomanNumerals("MDCCCCXCV");
		assertEquals("Incorrect number of characters saved.", 3, charactersSaved);
		
		// test replacing LXXXXX
		charactersSaved = RomanNumerals.findMinimalRomanNumerals("CDLXXXXIII");
		assertEquals("Incorrect number of characters saved.", 3, charactersSaved);
		
		// test replacing VIIII
		charactersSaved = RomanNumerals.findMinimalRomanNumerals("MDCCXVIIII");
		assertEquals("Incorrect number of characters saved.", 3, charactersSaved);
	}
	
	@Test
	public void testMultipleReplacements() {
		
		// test replacing both LXXXX and IIII
		int charactersSaved = RomanNumerals.findMinimalRomanNumerals("MCLXXXXIIII");
		assertEquals("Incorrect number of characters saved.", 5, charactersSaved);
		
		// test replacing both CCCC and XXXX
		charactersSaved = RomanNumerals.findMinimalRomanNumerals("MMCCCCXXXXV");
		assertEquals("Incorrect number of characters saved.", 4, charactersSaved);
	}

}
