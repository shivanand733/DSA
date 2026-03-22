package march;

import java.util.Scanner;

public class SumOf2Din3d {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Size of Arrays.");
	
//	Creating the 3D Arrays....
	int arry[][][] = new int [scan.nextInt()][scan.nextInt()][scan.nextInt()];
	System.out.println("3D Array: ");
	for (int i = 0; i <= arry.length-1; i++) {
		for (int j = 0 ; j <= arry[i].length-1; j++) {
			for (int k = 0; k <= arry[i][j].length-1; k++) {
				System.out.println("Enter Numbers " + i + "" + j + "" + k);
				arry[i][j][k] = scan.nextInt();
			}
		}
	}
	
	//Apply the logic and  Print the Results 
	for (int i = 0; i <= arry.length-1;i++) {
		int sum = 0;
		System.out.println("Layer " + (i+1) + ":");
		for (int j = 0; j<= arry[i].length-1; j++) {
			for (int k = 0; k <= arry[i][j].length-1;k++) {
				System.out.print(arry[i][j][k] +" ");
				sum += arry[i][j][k];
			}
			System.out.println();
		}

	}
	

	for (int i = 0; i <= arry.length-1;i++) {
		int sum = 0;
//		System.out.println("Layer " + (i+1) + ":");
		for (int j = 0; j<= arry[i].length-1; j++) {
			for (int k = 0; k <= arry[i][j].length-1;k++) {
//				System.out.print(arry[i][j][k] +" ");
				sum += arry[i][j][k];
			}
//			System.out.println();
		}
		System.out.println("Sum of the each 2D layer in 3D Arrays: "  + sum);

	}

}
}
