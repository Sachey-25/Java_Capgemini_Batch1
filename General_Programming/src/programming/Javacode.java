package programming;

public class Javacode {

	public static void main(String[] args) {
		//primitive data types
		/* 1. Integer * 2. Character * 3. Float * 4. Double * 5. Short * 6. Long * 7. Byte
		 * 8. Boolean
		 */
		int number_one = 10;
		int number_two = 20;
		System.out.println("First number is : " + number_one);
		System.out.println("Second number is: "+ number_two);
		//Note : If you wanted to print anything / make use of Syso(stdout) we should call
		//only the defined variable but not the value.
		
		//Character
		char ch = 'S';
		char second = 'S';
		char sentence = 'D';
		System.out.println("first Character is: " + ch + " " + 
		"Second Charecter"+  " "  +second + " " +"Third Character" +  " " + sentence);
		
		float decimal = 19.35f;
		System.out.println(decimal);
		
		double decimal_ = 19.9812345678908;
		System.out.println(decimal_);
		
		short age; //variable age is Declared  
		age = 28; // age has got assigned to 28 
		System.out.println(age); // Printing the age variable
		
		long limit;
		limit = 2345745355312345671L;
		System.out.println(limit);
		
		boolean letssay = true;
		boolean letssayin = false;
		System.out.println(letssay);
		System.out.println(letssayin);
	}
}