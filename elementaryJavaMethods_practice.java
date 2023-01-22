//Cristian Fabricio Castro
package projects;

public class various_methods {
	static void addition() {
		int x = 13;
		int y = 13;
		int sum = x + y;
		System.out.println("The sum of 13 + 13 is " + sum + ".");
		//This method adds two numbers and prints out the result.
	}
	static void subtraction() {
		int x = 20;
		int y = 7;
		int subtractionResult = x - y;
		System.out.println("The subtraction of 20 - 7 is " + subtractionResult + ".");
		//This method subtracts two numbers and prints out the result.
	}
	static void multiplication() {
		int x = 2;
		int y = 6;
		int multiplicationResult = x * y;
		System.out.println("The multiplication of 2 x 6 is " + multiplicationResult + ".");
		//This method multiplies two numbers and prints out the result.
	}
	static void division() {
		int x = 40;
		int y = 5;
		int divisionResult = x/y;
		System.out.println("The quotient of 40 / 5 is " + divisionResult + ".");
		//This method divides two numbers and prints out the result.
	}
	static void cos() {
		double x = 30;
		double cosResult = Math.cos(x);
		System.out.println("The cosine of 30 is " + cosResult + ".");
		//This method prints out the cosine of an angle.
	}
	static void sin() {
		int x = 90;
		double sinResult = Math.sin(x);
		System.out.println("The sin of 90 is " + sinResult + ".");
		//This method prints out the sine of an angle.
	}
	static void tangent() {
		int x = 12;
		double tanResult = Math.tan(x);
		System.out.println("The tangent of the angle 12 is " + tanResult + ".");
		//This method prints out the tangent of the given angle.
	}
	static void squareRoot() {
		int x = 121;
		double squareRootResult = Math.sqrt(x);
		System.out.println("The square root of 121 = " + squareRootResult + ".");
		//This method prints out the square root of a number.
	}
	static void raisedPower() {
		int x = 2;
		int y = 4;
		double raisedPowerResult = Math.pow(x, y);
		System.out.println("2 to the 4th power is " + raisedPowerResult + ".");
		//This method raises the first number to the power of the second number and prints out the result.
	}
	static void logarithm() {
		int x = 8;
		double logResult = Math.log(x);
		System.out.println("The logarithm of 8 is " + logResult + ".");
		//This method prints out the natural logarithm of a number.
	}
	static void minimum() {
		int x = 54;	
		int y = 21;
		int minResult = Math.min(x, y);
		System.out.println("The minimum number between 54 and 21 is " + minResult + ".");
		//This method prints out the smallest number between two numbers.
	}
	static void maximum() {
		int x = 123;
		int y = 122;
		int maxResult = Math.max(x, y);
		System.out.println("The maximum number between 123 and 122 is " + maxResult + ".");
	 	//This method prints out the bigger number between two numbers.
	}
	static void round() {
		double x = 3.61;
		double roundResult = Math.round(x);
		System.out.println("3.61 rounded to the nearest integer is " + roundResult + ".");
		//This method rounds the number to the nearest integer and prints out the result. 
	}
	static void exp() {
		int x = 3;
		double expResult = Math.exp(x);
		System.out.println("e to the power of 3 is " + expResult + ".");
		//This method prints out Euler's number e to the power of the given number.
	}
	static void absoluteValue() {
		int x = -11;
		int absoluteValueResult = Math.abs(x);  
		System.out.println("The absolute value of (-11) is " + absoluteValueResult + ".");  
		//This method takes the absolute value of a number and prints out the result.
	}
	public static void main(String[]args) {
		addition();
		subtraction();
		multiplication();
		division();
		cos();
		sin();
		tangent();
		squareRoot();
		raisedPower();
		logarithm();
		minimum();
		maximum();
		round();
		exp();
		absoluteValue();
		
		System.out.println();
		System.out.println();
		
		FibonacciSequence.Fibonacci();   //This line calls the method present in the other class within the same package.
		System.out.println();     //Finally, this line prints everything in the order previously specified.
		
	}
}
