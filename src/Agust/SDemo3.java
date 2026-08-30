package Agust;

import java.util.Scanner;

public class SDemo3 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	// Ask use to String input and position 
	System.out.println("Enetr The String");
	String Str1 = scan.nextLine();
	
	System.out.println("Enetr the Position");
	int start = scan.nextInt();
	int end = scan.nextInt();
	
	for (int i = start; i <= end;i++) { 
			System.out.print(Str1.charAt(i));
	}
	
	System.out.println();// new line 
	
	//or using Substring function 
	String sub = Str1.substring(start, end);
	System.out.println("Substring " + sub);
}

}
