package S1Feb;

import java.util.Scanner;

public class DemoApp2D_A {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the NoOfClass And NoOfStudent ");
	int NoOfClass = scan.nextInt();
	int NoOfStudent = scan.nextInt();
//	Create an Arrays 
	int[][] arry = new int[NoOfClass][NoOfStudent];
	
	System.out.println("Enter each Students with respective class ");
	for (int j = 0; j <= arry.length-1;j++) {
		for (int i = 0; i <= arry.length-1;i++) {
			arry[j][i] = scan.nextInt();
		}
	}
	
	System.out.println("The Each class with respective class ");
	for (int j = 0; j <= arry.length-1;j++) {
		for (int i = 0;i <= arry.length-1; i++) {
			System.out.print(arry[j][i] + " ");
		}
		System.out.println();
	}
}

}
