package June;

import java.util.Scanner;

public class demo1 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Name: ");
	
	String name = scan.nextLine();
	
	int count = 0 ;
	for (int i = 0; i <=name.length()-1;i++) {
	
		char ch = Character.toLowerCase(name.charAt(i));
		
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			count++;
		}
	}
	
	System.out.println("The Count of the vowels in the word " +  count);
}
}
