package Operators;

public class assignmentOperators {

	public static void main(String[] args) {
		
		int number_one=15;
		int number_two=20;
		
		System.out.println(number_one==number_two); //false
		number_one=number_two; //Assigning mechanism here
		System.out.println("===> Result is on assignment : " + number_one); //Number one's value gets assigned with 
		//the value of number two.
		System.out.println(number_one==number_two); //true
		
		//number_one += number_two 
		// ===> number_one = number_one+number_two ==> number_one = 20+20 = 40
		number_one+=number_two;
		System.out.println("==> Result is on additon : " + number_one);
		
		// number_one -= number_two ==> number_one = number_one - number_two => 40-20 = 20
		number_one -= number_two;
		System.out.println("==> Result is on subtraction : " + number_two); // 20
		System.out.println("==> Result is on subtraction: " + number_one); // 20
		
		// number_one *= number_two
		number_one *= number_two;
		System.out.println("==> Result is on multiply: " + number_two); // 20
		System.out.println("==> Result is on multiply: " + number_one); // 400
		
		// number_one /= number_two
		number_one /= number_two;
		System.out.println("==> Result is on division: " + number_two); // 20
		System.out.println("==> Result is on disision: " + number_one); // 20
		
		// number_one %= number_two
		number_one %= number_two;
		System.out.println("==> Result is on mod: " + number_two); // 20
		System.out.println("==> Result is on mod: " + number_one); // 0
	
	}
}