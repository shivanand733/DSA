package may;

import java.util.Scanner;

public class ReverseName {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Name");
		StringBuffer sb = new StringBuffer(scan.nextLine());
		System.out.println("The Original Name " + sb );
		
		  // this Methode is use to reverce the String 
		System.out.println("The Reverse Name " + sb.reverse());
	}
}
