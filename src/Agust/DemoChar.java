package Agust;

import java.util.Scanner;
/* Quation is
 * take Input from the user 
 * Ask for index
 * print the specific character at the index
 */
public class DemoChar {
public static void main(String[] args) {
	Scanner Scan = new Scanner(System.in);

	System.out.println("Enter The String");
	String s1 = Scan.nextLine();
	
	System.out.println("Enetr the index");
	int index = Scan.nextInt();
	
	System.out.println("Charecter At Index " + index + " Charecter is " + s1.charAt(index));
}
}
