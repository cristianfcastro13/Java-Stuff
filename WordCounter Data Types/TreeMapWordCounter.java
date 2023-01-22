package DataStructures;

import java.io.*;
import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.Map.Entry;

/**
 * WordCounterMain class
 * @author TMyatt & CCastro
 *
 */
public class Assignment8 {
	static TreeMap<String, Integer> wordsTree = new TreeMap<String, Integer>();
	
	/**
	 * addWordToTreeMap - add word to sorted list or increment counter
	 * @param inWord - the word to add to the list
	 * @return number of words in the list
	 */
	static int addWordToTreeMap(String inWord) {
		
		//If word found in tree list, add 1 to the count
		if(wordsTree.containsKey(inWord) == true) {
			wordsTree.replace(inWord, wordsTree.get(inWord) + 1);
		}
		
		//If Word is not in tree list, add inWord to tree list with value (count) of 1
		wordsTree.putIfAbsent(inWord, 1);
		
		return wordsTree.size();
	}
	
	/**
	 * printWordList - dump the list if count > inMinimum
	 */
	@SuppressWarnings("rawtypes")
	static void printWordList(int inMinimum) {
		
		if (wordsTree.size() > 0) {
			System.out.println("Total words: " + wordsTree.size());
			Iterator treeIterator = wordsTree.entrySet().iterator();  //Create iterator for tree list
			
			//Iterator loop that prints an element if the value present in it is equal or more than inMinimum
			while (treeIterator.hasNext()) {
				Entry n = (Entry)treeIterator.next();
				int count = (int) (n.getValue());
				if (count >= inMinimum) {
					System.out.println(n.getKey() + ":" + count);
				}
			}//END while
		}//END if
	}

	/**
	 * getVerse - Parse and return only the Psalms verse
	 * @param inLine - the line to parse on tab delimiter
	 * @return right half of tab delimited string
	 */
	static String getVerse(String inLine) {
		String[] ver = inLine.split("\t");
		return ver[1];
	}

	/**
	 * Word Counter main()
	 * @param args
	 */
	public static void main(String[] args) {
		Instant start = Instant.now(); //Timer starts here
		try {
			// Open the required text file for sequential read
			Scanner inputFile = new Scanner (new File("bible-complete10.txt"));
			// Check for EOF, read the next line, and display it
			while (inputFile.hasNextLine()) {
				String inLine, verse;
				String[] verseParsed;
				
				inLine = inputFile.nextLine();
				verse = getVerse(inLine);
				verseParsed = verse.split("[ :;,.'!?()-]+");
				for (String s: verseParsed) {
					addWordToTreeMap(s.toLowerCase());
				}
			}		
			// Close the required file when EOF is reached
			inputFile.close();
			printWordList(100000);
		} // END try
		catch (Exception e) {
			// All Exceptions come here for graceful termination
			System.out.println("PsalmsReaderMain Error: " + e);
		} // END catch
		Instant stop = Instant.now(); //Timer stops here
		long timeElapsed = Duration.between(start, stop).toMillis(); //The time is converted to milliseconds and then assigned to a variable for output 
		System.out.println("Time(ms): " + timeElapsed);
	} // END main
} // END class
