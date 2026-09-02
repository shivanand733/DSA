package sep;

import java.util.Scanner;

public class SDemo4 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	//take input from The user 
	System.out.println("Enter the String: ");
	String str1 = scan.nextLine();
	
	String rev ="";
	for (int i = str1.length()-1; i >= 0; i--) {
		rev = rev + str1.charAt(i);
	}
	
	System.out.println("The Orginal String is: " + str1);
	System.out.println("The reverce String is : " + rev);
	
	}
}
