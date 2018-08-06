package romanNumerals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RomanNumerals {
	
	// Contains all the roman numeral patterns that we can replace.
	// We list the 5 character patterns first because they contain their respective 4 character patterns.
	public static CharSequence[] romanNumeralsToReplace = new CharSequence[] {
		new StringBuffer("DCCCC"),
		new StringBuffer("LXXXX"),
		new StringBuffer("VIIII"),
		new StringBuffer("CCCC"),
		new StringBuffer("XXXX"),
		new StringBuffer("IIII")
	};
		
	public static void main(String[] args) throws FileNotFoundException {
		
		int charactersSaved = 0;
		
		//boilerplate code to read matrix.txt file
		File file = new File("roman.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		//read each line and add it the matrix array
		try {
			String line = bufferedReader.readLine();
			while (line != null) {
				
				//finds the characters saved by writing the minimal form of the Roman numeral
				charactersSaved += findMinimalRomanNumerals(line);
				
				line = bufferedReader.readLine();
			}		
		} catch (IOException e) {
			e.getStackTrace();
		}
						
		System.out.println("The number of characters saved is " + charactersSaved);
	}
	
	/*
	 * Determines a Roman numeral's minimal form.
	 * @param The original Roman Numeral
	 * @return Number of characters saved
	 */
	public static int findMinimalRomanNumerals(String romanNumeral) {
		
		String replacement = romanNumeral;
		for (int i = 0; i < romanNumeralsToReplace.length; i++) {
			replacement = replacement.replace(romanNumeralsToReplace[i], "00");
		}
		
		return romanNumeral.length() - replacement.length();
	}
}
