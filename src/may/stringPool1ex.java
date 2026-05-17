package may;

import java.util.Scanner;

public class stringPool1ex {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in) ;
	
	String userName = scan.nextLine();
	
	String str1 = userName;
	String str2 = new String(userName);
	
	System.out.println("Enter A linre of text: String create the using The Double queate: " + str1);
	System.out.println("String Crete Using the New keyWord " + str2);
	
	System.out.println("Are the two String Eqal by the reference " + (str1 == str2));
	
	System.out.println("Are the two String equal by 'equal()? " + (str1.equals(str2)));
}
}
