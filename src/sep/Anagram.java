package sep;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	//Ask To user to enter the string 2 strings 
	System.out.println("Enter two String :");
	
	// Store the two Strings 
	String str1 = scan.nextLine();
	String str2 = scan.nextLine();
	
	// check the String Length 
	if (str1.length() != str2.length()) {
		System.out.println("This Is not Anagram");
	} else  {
		str1 = str1.toLowerCase(); // convert the string in lower case because avid the apply case ignore case 
		str2 = str2.toLowerCase();
		
		//convert the String to character array 
		
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if (Arrays.equals(arr1, arr2)) {
			System.out.println("This is An Anagram");
		} else {
			System.out.println("This is not An Anagaram");
		}
	}
	
	
}
}
