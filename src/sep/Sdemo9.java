package sep;

import java.util.Scanner;

public class Sdemo9 {
public static void main(String[] args) {
//	shiv();
	palindrome();
}

public static void shiv() {
	Scanner scan = new Scanner(System.in);

	System.out.println("Enetr String");
	String str1 = scan.nextLine();
	
	for (int i = 0; i < str1.length();i++) {
		for (int j = 0; j < str1.length(); j++) {
			for (int k = 0; k < str1.length();k++) {
				
				if(i != j && j != k && k != i) {
					System.out.println(str1.charAt(i) + "" + str1.charAt(j) + "" + str1.charAt(k));
				}
			}
		}
	}
}

public static void palindrome() {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter String");
	String str = scan.nextLine();
	int oddCount = 0;
	
	for(int i = 0; i <= str.length()-1;i++) {
		char ch = str.charAt(i);
		int count = 0; 
		
		for (int j = 0; j < str.length();j++) {
			if (ch == str.charAt(j)) {
				count++;
			}
		}
		
		if (count % 2 != 0) {
			oddCount++;
		}
	}
	
	oddCount = oddCount / 2;
	
	if (oddCount <= 1) {
		System.out.println("The String '" + str +"' can be rearranged to from palindrome.");
		
	} else {
		System.out.println("The String '" + str +"' cannot be rearrnaged to from palindrome.");
	}
}
}
