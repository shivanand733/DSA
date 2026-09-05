package sep;

import java.util.Scanner;

public class SDemo6 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	//take input form the User 
	System.out.println("Eneter String: ");
//	Store the Input 
	String str1 = scan.nextLine();
	
	
	
	for (int i = 0; i < str1.length(); i++) {
		
		boolean alredyCheck = false;
		 for (int j = 0; j < i;j++) {
			 if (str1.charAt(i) == str1.charAt(j)) {
				 alredyCheck = true;
				 break;
				
			 }
		 }
	
		if(alredyCheck) {
			continue;
		}
		
		int count = 0;
		for (int k = 0; k < str1.length(); k++) {
			if (str1.charAt(i) == str1.charAt(k)) {
				count++;
			}
		}
		 
		System.out.println(str1.charAt(i) + "=" + count);
	
	}
	scan.close();
	
}
}
