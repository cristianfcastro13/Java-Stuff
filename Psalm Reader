package Assignment3;

import java.io.*;
import java.util.Scanner;

public class PsalmsReaderMain {
	
	
	/**
	 * getReference - Parse and return only the Psalms reference
	 * @param inLine
	 * @return
	 */
	
	static String getReference(String inLine) {
		String reference = "";
		String[] refArray = inLine.split("\t"); //Parsing the inLine for reference grabbing
		reference = refArray[0]; //This will return the characters from position 0 to right before the split character
		return reference;
	}
	
	
	/**
	 * getVerse - Parse and return only the Psalms verse
	 * @param inLine
	 * @return
	 */
	
	static String getVerse(String inLine) {
		String verse = "";
		String[] verseArray = inLine.split("\t"); //Parsing the inLine for verse grabbing
		verse = verseArray[1]; //This will returns the characters from the split character to the end
		return verse;
	}

	public static void main(String[] args) {
		
		try {
			
			String ref = "";
			String ver = "";
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("What chapter would you like to access?\n");
			int chapter = scan.nextInt();
			System.out.println();
			
			System.out.print("What verse of that chapter would you like to access?\n");
			int verse = scan.nextInt();
			System.out.println();
			
			//Create the reference string for comparison
			String reference = "Psalms " + chapter + ":" + verse;
			
			//Open the required text file for sequential read
			Scanner inputFile = new Scanner (new File("bible-psalms.txt"));
			
			//While loop that checks for EOF and sequentially reads the next line
			while (inputFile.hasNextLine() && !reference.equals(ref)) {
				String inLine = inputFile.nextLine();
				ref = getReference(inLine);
				ver = getVerse(inLine);
			}
			
			//Prints verse if it exists, else it prints an error message
			if(reference.equals(ref)) {
				System.out.println(ver);
			} else {
				System.out.println("\nERROR: I'M SORRY DEAR BUT THIS PSALM CHAPTER AND VERSE COMBINATION DOES NOT EXIST.");
			}
			
			//Close the required file when EOF is reached
			inputFile.close();
			} catch (Exception e) {
			//All Exceptions come here for graceful termination
			System.out.println("PsalmsReaderMain Error: " + e);
		} //END try/catch
	} //END main
} //END class
