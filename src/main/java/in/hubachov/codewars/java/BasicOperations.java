package in.hubachov.codewars.java;

/**
 * Your task is to create a function - basic_op().

 The function should take three arguments - operation(string/char), value1(number), value2(number). The function
 should return result of numbers after applying the chosen operation.

 Examples:

 basicOp('+', 4, 7)         // Output: 11
 basicOp('-', 15, 18)       // Output: -3
 basicOp('*', 5, 5)         // Output: 25
 basicOp('/', 49, 7)        // Output: 7

 * Created by Sashko on 6/15/17.
 */
public class BasicOperations {

	public Integer basicMath(String op, int v1, int v2) {
		switch (op) {
			case "+": return v1 + v2;
			case "-": return v1 - v2;
			case "*": return v1 * v2;
			case "/": return v1 / v2;
		}
		return 0;
	}

}
