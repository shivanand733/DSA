package Agust;

import java.util.Scanner;

public class Demo3 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter String: ");
	String str1 = scan.nextLine();
	
	String[] word = str1.split(" ");
	String result = " ";
	
	for (int i = 0; i < word.length;i++) {
		result = result + Character.toUpperCase(word[i].charAt(0)) 
		+ word[i].substring(1).toLowerCase() + " ";
	}
	
	System.out.println("The Original String: " + str1);
	System.out.println("The Title Case: " + result);
	
}
}