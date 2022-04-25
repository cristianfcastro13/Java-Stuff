package projects;

import java.io.File;
import java.util.*;

/**
 * BracketsBalancing class
 * @author CCastro
 */
public class BracketsBalancing {
	static Stack<String> brackets = new Stack<String>();
	static int error = 0;
	static boolean balanced = true;
	static boolean doneOutput = false;
	static String expectedError;
	static String curr;

	/**
	 * bracketType - calculates the bracket type(braces, brackets or parenthesis)
	 * @param bracket - the bracket to identify
	 * @return type of bracket
	 */
	public static int bracketType (String bracket) {
		int type = 0;
		
		if (bracket.equals("(") || bracket.equals(")")) {
			type = 1;
			expectedError = ")";
		}
		if (bracket.equals("[") || bracket.equals("]")) {
			type = 2;
			expectedError = "]";
		}
		if (bracket.equals("{") || bracket.equals("}")) {
			type = 3;
			expectedError = "}";
		}
		return type;
	}
	
	/**
	 * errorOutput - prints the error according to the type of error
	 */
	public static void errorOutput(int error) {
		String errorMessage = null;
		
		// Switch statement that assigns to output the correspondent error message
		switch (error) {
		case 1:
			errorMessage = "Not balanced: Expected " + expectedError + ", found " + curr + ".";
			break;
		case 2:
			errorMessage = "Not balanced: Stack is empty, found " + curr + ".";
			break;
		case 3:
			errorMessage = "Not balanced: Stack is not empty at end.";
			break;
		}
		
		System.out.println(errorMessage);
		doneOutput = true;
	}
	
	/**
	 * BracketsBalancing main()
	 * @param args (arguments_or_args_for_short)
	 */
	public static void main(String[] arguments_or_args_for_short) {
		try {
			String inLine;
			String[] lineParsed;
			int peekType;
			int currType;
			
			Scanner inputFile = new Scanner (new File(arguments_or_args_for_short[0])); // Scanner gets its file name from the command-line interface.
			
			// This while loop parses through the file's lines until an error is found or until EOF
			while(inputFile.hasNextLine() && balanced == true) {
				inLine = inputFile.nextLine();
				lineParsed = inLine.split("");
				
				// This for loop goes parses the Java doc to verify its braces, brackets and parenthesis are balanced
				for(int i = 0; i < lineParsed.length; i++) {
					curr = lineParsed[i];
					
					if(curr.equals("{") || curr.equals("[") || curr.equals("(")) {
						brackets.push(curr);
					}
					
					if (curr.equals("}") || curr.equals("]") || curr.equals(")")) {
						if(brackets.isEmpty()) {
							error = 2;
							balanced = false;
							errorOutput(error);
							break;
						}
						
						currType = bracketType(curr);
						peekType = bracketType(brackets.peek());
						
						// This if loop compares the type of parenthesis being read with the one present in the stack to either pop the stack or detect an error
						if(peekType == currType) {
							brackets.pop();
						} else {
							error = 1;
							balanced = false;
							errorOutput(error);
							break;
						}
					}
					
				} // END for
			} // END while
			
			// If there was no output after EOF and there is still something in the stack, then the stack is not empty error is printed out
			if (brackets.empty() != true && doneOutput != true) {
				error = 3;
				balanced = false;
				errorOutput(error);
			}
			
			if (balanced == true) {
				System.out.println("Balanced.");
			}
			
		}
		catch (Exception e) {
			// All Exceptions come here for graceful termination
			System.out.println("BracketsBalancingMain Error: " + e);
		}
	} // END main
} // END class
