package sep;

import java.util.Scanner;

public class SDemo5 {
public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 
	 System.out.println("Entr the String");
	 String str = scan.nextLine();
	 
	 char ch = scan.nextLine().charAt(0);
	 
	 int possion = str.indexOf(ch);
	 
	 System.out.println("the Index of the possion is " + possion);
}
}
