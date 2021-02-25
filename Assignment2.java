package coreJavaOperatorsAndNumbers;

public class Assignment2 {

	public static void main(String[] args) {
		convertToBinary();
		convertToDecimal();
		useLeftShift();
		useRightShift();
		useBitwiseAndOr();
		usePostfixOperator();
		increment();
		incrementThenAdd();
	}

	/**
	 * Write the following integers in binary notation. 
	 * Do not use any Java functions or online conversion 
	 * applications to calculate the answer as this will 
	 * hinder the learning process and your understanding 
	 * of the concept. However, you may check your answers 
	 * using Java methods.
	 */
	public static void convertToBinary() {
		System.out.println("convertToBinary: ");
		int[] values = {1, 8, 33, 78, 787, 33987};
		for(int i = 0; i < values.length; i++) {
			int num = values[i];
			System.out.print(num + " in binary is ");
			String ret = "";
			while(num != 0) {
				if(num % 2 == 1) {
					ret += "1";
				} else {
					ret += "0";
				}
				num >>= 1;
			}
			for(int j = ret.length() - 1; j > -1; j--) {
				System.out.print(ret.charAt(j));
			}
			System.out.println();
		}
	}
	
	/**
	 * Convert the following binary numbers to decimal notation. 
	 * Do not use any Java functions or online conversion 
	 * applications to calculate the answer as this will hinder 
	 * the learning process and your understanding of the concept. 
	 * However, you may check your answers using Java methods.
	 */
	public static void convertToDecimal() {
		System.out.println("convertToDecimal: ");
		String[] values = {"0010", "1001", "0011 0100", "0111 0010", "0010 0001 1111", "0010 1100 0110 0111"};
		for(int i = 0; i < values.length; i++) {
			String num = values[i];
			System.out.print(num + " converted to decimal: ");
			int ret = 0;
			int power = num.length() - 1;
			for(int j = 0; j < num.length(); j++) {
				if(num.charAt(j) == ' ') {
					continue;
				} else if(num.charAt(j) == '1'){
					ret += Math.pow(2, power);
				}
				power--;
			}
			System.out.println(ret);
		}
	}
	
	/**
	 * Write a program that declares an integer a variable x and 
	 * assigns the value 2 to it and prints out the binary string 
	 * version of the number ( Integer.toBinaryString(x) ). Now, 
	 * use the left shift operator (<<) to shift by 1 and assign 
	 * the result to x. Before printing the results, write a 
	 * comment with the predicted decimal value and binary string. 
	 * Now, print out x in decimal form and in binary notation.
	 */
	private static void useLeftShift() {
		System.out.println("useLeftShift:");
		int[] values = {2, 9, 17, 88};
		for(int i = 0; i < values.length; i++) {
			int x = values[i];
			System.out.println(x + " as binary: " + Integer.toBinaryString(x));
			x <<= 1;
			// predict 2 to be decimal 4 with binary string "100"
			System.out.println(x + " as binary: " + Integer.toBinaryString(x));
		}
	}
	
	/**
	 * Write a program that declares a variable x and assigns 150 
	 * to it and prints out the binary string version of the number. 
	 * Now use the right shift operator (>>) to shift by 2 and assign 
	 * the result to x. Write a comment indicating what you anticipate 
	 * the decimal and binary values to be. Now print the value of x 
	 * and the binary string.
	 */
	private static void useRightShift() {
		System.out.println("useLeftShift:");
		int[] values = {150, 225, 1555, 32456};
		for(int i = 0; i < values.length; i++) {
			int x = values[i];
			System.out.println(x + " as binary: " + Integer.toBinaryString(x));
			x >>= 2;
			// predict 150 to be decimal 37 with binary string "100101"
			System.out.println(x + " as binary: " + Integer.toBinaryString(x));
		}
	}
	
	/**
	 * Write a program that declares 3 int variables x, y, and z. 
	 * Assign 7 to x and 17 to y. Write a comment that indicates what 
	 * you predict will be the result of the bitwise & operation on x 
	 * and y. Now use the bitwise & operator to derive the decimal and 
	 * binary values and assign the result to z.
	 * 
	 * Now, with the preceding values, use the bitwise | operator to 
	 * calculate the “or” value between x and y. As before, write a 
	 * comment that indicates what you predict the values to be before 
	 * printing them out.
	 */
	private static void useBitwiseAndOr() {
		int x = 7;
		int y = 17;
		// z will be 1
		int z = x & y;
		System.out.println("useBitwiseAnd: " + z);
		// z will be 23
		z = x | y;
		System.out.println("useBitwiseAnd: " + z);
	}
	
	/**
	 * Write a program that declares an integer variable, assigns a number, 
	 * and uses a postfix increment operator to increase the value. Print 
	 * the value before and after the increment operator.
	 */
	private static void usePostfixOperator() {
		int x = 15;
		System.out.println("usePostfixOperator: ");
		System.out.println("before: " + x++);
		System.out.println("after: " + x);
	}
	
	/**
	 * Write a program that demonstrates at least 3 ways to increment a 
	 * variable by 1 and does this multiple times. Assign a value to an 
	 * integer variable, print it, increment by 1, print it again, 
	 * increment by 1, and then print again.
	 */
	private static void increment() {
		System.out.println("increment: ");
		int x = 1;
		System.out.println("x: " + x);
		x += 1;
		System.out.println("x after x += 1: " + x);
		x++;
		System.out.println("x after x++: " + x);
		++x;
		System.out.println("x after ++x: " + x);
	}
	
	/**
	 * Write a program that declares 2 integer variables, x, and y, and 
	 * then assigns 5 to x and 8 to y. Create another variable sum and 
	 * assign the value of ++x added to y and print the result. Notice 
	 * the value of the sum (should be 14). Now change the increment 
	 * operator to postfix (x++) and re-run the program. Notice what 
	 * the value of sum is. The first configuration incremented x and 
	 * then calculated the sum while the second configuration calculated 
	 * the sum and then incremented x.
	 */
	private static void incrementThenAdd() {
		System.out.println("incrementThenAdd: ");
		int x = 5;
		int y = 8;
		int sum = ++x + y;
		System.out.println("sum of ++x and y: " + sum);
		int a = 5;
		int b = 8;
		sum = a++ + b;
		System.out.println("sum of x++ and y: " + sum);
	}
}
