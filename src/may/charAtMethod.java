package may;

import java.util.Scanner;

public class charAtMethod {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Entr the Name");
	String s1 = scan.nextLine();
	
	System.out.println("Enter Number");
	int ind = scan.nextInt();
	
	System.out.println("The Charecter At Index " + s1.charAt(ind) + ".");
}
}
