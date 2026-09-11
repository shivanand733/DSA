package sep;

import java.util.Scanner;

public class SDemo8 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	reverseString();
	RemoveALlvowels();
	
}

public static void reverseString() {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Eneter String / name: ");
	StringBuffer sb = new StringBuffer(scan.nextLine());
	
	StringBuffer sb1 = sb.reverse();
	System.out.println("The Original String " + sb);
	System.out.println("The reverce String " + sb1);
	
}

public static void RemoveALlvowels() {
	Scanner scan = new Scanner(System.in);
	
	//take Input from user 
	System.out.println("Eneter String for Remove All vowels in String");
	String str  = scan.nextLine().toLowerCase();
	
	String result = "";
	
	for (int i = 0; i < str.length();i++) {
		char ch = str.charAt(i);
		
		if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
			result = result + ch;
		}
	}
	
	System.out.println(" The output: " + result);
	
}
}
