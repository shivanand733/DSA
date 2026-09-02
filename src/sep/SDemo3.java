package sep;

import java.util.Scanner;

import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

public class SDemo3 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	//take input from the user 
	System.out.println("Enter String");
	String str = scan.nextLine();
	
	//take an input from the charecter 
	System.out.println("Enetr the Character ");
	char ch = scan.nextLine().charAt(0);
	
	int count = 0;
	for (int i = 0; i <= str.length()-1; i++) {
		if(str.charAt(i) == ch) {
			count++;
		}
	}
	
	System.out.println("The Input String : " + str);
	System.out.println("Charecter: " + ch );
	System.out.println("Charecter Occurence: " +  count);
}
}
