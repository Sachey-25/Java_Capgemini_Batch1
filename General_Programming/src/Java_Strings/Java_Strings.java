package Java_Strings;

public class Java_Strings {

	public static void main(String[] args) {
		// Strings are used for storing text
		// A string variable contains a collection of characters surrounded by 
		// double quotes
		
		String greetings = "Good Evening";
		System.out.println(greetings);
		
		//String methods 
		//String length..
		String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("Length of the string is :" + alphabets.length()); //26
		String name="SACHIN";
		/* System.out.println(name[0]); S
		System.out.println(name[1]); A
		System.out.println(name[2]); C
		System.out.println(name[3]); H
		System.out.println(name[4]); I
		System.out.println(name[5]); N ====> 6 */
		
		String name_ = "sachin";
		System.out.println("name sachin is converted to uppercase: " + name_.toUpperCase());
		String another_name="SACHIN";
		System.out.println("name sachin is converted to lowercase: " + another_name.toLowerCase());
		
		// I would like to locate a specific letter or a word
		System.out.println("Would like it see the S : " + another_name.indexOf("S"));
		System.out.println("Would like it see the A : " + another_name.indexOf("A"));
		System.out.println("Would like it see the C : " + another_name.indexOf("C"));
		System.out.println("Would like it see the H : " + another_name.indexOf("H"));
		System.out.println("Would like it see the I : " + another_name.indexOf("I"));
		System.out.println("Would like it see the N : " + another_name.indexOf("N"));		
	}
}