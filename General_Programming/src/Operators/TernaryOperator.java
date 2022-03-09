package Operators;

public class TernaryOperator {

	public static void main(String[] args) {
		// This operator evaluates a boolean expression and assign the value based 
		// on the result
		// Syntax:
		// variable <VN> = (expression) ? value if true : value if false
		
		int number_one, number_two, number_three, number_four, number_five;
		number_one=25;

		number_two = (number_one == 25) ? 100:200;
		System.out.println("The value of number_two: " + number_two);
		number_three = (number_one == 5) ? 200:200;
		System.out.println("The value of number_three: " + number_three);
		number_four = (number_one == 25) ? 300:200;
		System.out.println("The value of number_four: " + number_four);
		number_five = (number_one == 15) ? 400:200;
		System.out.println("The value of number_five: " + number_five);
		
		
		int arr[][] = {{10,20,30,40},{50,30,56}};
		System.out.println(arr);
	}
}