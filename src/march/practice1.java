package march;

import java.util.Scanner;

public class practice1 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Eneter the name");
	String userName = scan.nextLine();
	String str1 = userName;
	String str2 = new String(userName);
	
	System.out.println("Enetr a line of text: String create the using the double quate: " + str1);
	
	System.out.println("Sytring Crteate using the new Keyword  " + str2);
	
	if (str1 == str2) {
		System.out.println("True");
		
	} else {
		System.out.println("False");
	}
	
	if (str1.equals(str2)) {
		System.out.println("True");
	} else {
		System.out.println("False");
	}
}
}
