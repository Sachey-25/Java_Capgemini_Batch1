package Operators;

public class logicalOperator {

	public static void main(String[] args) {
		
		// and, or , not 
		// &&., || , !
		
		// && ===> will return true if both the operands are true.
		// || ===> will return true if one of the operand is true.
		// ! ===> Is the opposite/reverse representation of any operand. (Variable)
		
		boolean sachin = true; // operand one 
		boolean training = false; // operand two
		
		System.out.println("sachin && training : " + (sachin && training)); // false
		System.out.println("sachin || training : " + (sachin || training)); // true	
		System.out.println("sachin ! training : " + !(sachin && training)); // true	
		
	}
}