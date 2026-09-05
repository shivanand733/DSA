package sep;

import java.util.Scanner;

public class SDemo7 {
public static void main(String[] args) {
	Scanner Scan = new Scanner(System.in);
	
	System.out.println("Enetr the Strings");
	String str = Scan.nextLine();
	
	for(int i = 0; i <= str.length()-1;i++) {
		if(Character.isDigit(str.charAt(i))) {
			System.out.print(str.charAt(i));
		}
	}
}
}
