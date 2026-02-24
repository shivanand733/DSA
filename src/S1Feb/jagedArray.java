package S1Feb;

import java.util.Scanner;

//creating the jagged array
public class jagedArray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

//	Creating An Arrays
	System.out.println("Enter number of class");
	int[][] arry = new int[scan.nextInt()][];
	
		System.out.println("Enter each class how many  students");
		for (int i = 0; i <= arry.length-1; i++) {
			arry[i] = new int[scan.nextInt()];
		}
	
		System.out.println("Enter the Students marks in each class ");
	for (int j = 0; j <= arry.length-1; j++) {
		for (int i = 0; i <= arry[j].length-1; i++) {
			arry[j][i] = scan.nextInt();
		}
	}
	
	System.out.println("The Each class students marks");
	for (int j = 0; j <= arry.length-1; j++) {
		for (int i = 0; i <= arry[j].length-1; i++) {
			System.out.print(arry[j][i] + " ");
		}
		System.out.println(); 	// this is for next line 
	}
}
}
