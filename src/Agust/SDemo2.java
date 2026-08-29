package Agust;

import java.util.Scanner;

public class SDemo2 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Eneter String / name");
	StringBuilder str = new StringBuilder(scan.nextLine());
	
	System.out.println("The Reverse of the String / name: " + str.reverse());
	
}
}
