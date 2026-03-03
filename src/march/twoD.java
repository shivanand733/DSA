package march;

import java.util.Scanner;

public class twoD {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Eneter number of the class");
	//create an 2D arrays
	int[][] arry = new int[scan.nextInt()][];
	
	System.out.println("Enter the number students in the each class");
	for (int i = 0; i <= arry.length-1; i++) {
		arry[i]= new int[scan.nextInt()];
	}
	
	System.out.println("Enter your marks..");
	for (int j = 0; j <= arry.length-1;j++) {
		for (int i = 0; i <= arry[j].length-1; i++) {
			System.out.println("Enter Students marsk");
			arry[j][i] = scan.nextInt();
		}
	}
	
	for (int j = 0; j <= arry.length-1; j++) {
		for (int i = 0; i <= arry[j].length-1;i++) {
			System.out.println("The marks are : " + arry[j][i] + " ");
		}
		System.out.println();// the line breaker bz next line will be new line 
	}
}
}
