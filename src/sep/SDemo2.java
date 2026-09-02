package sep;

import java.util.Scanner;

public class SDemo2 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	//take input from the user
	System.out.println("Enter The String");
	String str = scan.nextLine();
	
	for (int i = 0; i <= str.length()-1;i++) {
		int count = 0;
		
		for (int j = 0; j <= str.length()-1; j++) {
			if(str.charAt(i) == str.charAt(j)) {
				count++;
			}
		}
		
		if (count > 1 && str.indexOf(str.charAt(i)) == i) {
			System.out.println(str.charAt(i) + " = " +  count);
		}
	}
}
}
