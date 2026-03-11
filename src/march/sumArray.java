package march;

import java.util.Scanner;

public class sumArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Size of the Arrays");
//		Array Creation
		int [] arry = new int[scan.nextInt()];
		int sum = 0;
		for (int i = 0; i<= arry.length-1; i++) {
			System.out.println("Enetr the Array "  + i);
			arry[i] = scan.nextInt();
		}
		
		for (int i = 0; i <= arry.length-1; i++) {
			sum += arry[i];
		}
		
		System.out.println("The Sum of the Arrys Are : " + sum);
	}
}
