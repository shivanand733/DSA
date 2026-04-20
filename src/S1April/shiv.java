package S1April;

import java.util.Scanner;

public class shiv {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
//	Create an Arrays 
	System.out.println("Enter The Size of Arrys");
	int arry[][][] = new int[scan.nextInt()][scan.nextInt()][scan.nextInt()];
	
	System.out.println("Enter the numbers");
	for (int i = 0; i <= arry.length-1; i++) {
		for (int j  = 0; j <= arry[i].length-1; j++) {
			for (int k = 0; k <= arry[i][j].length-1; k++) {
				arry[i][j][k] = scan.nextInt();
			}
		}
	}
	
	System.out.println("3D Array: ");
	for (int i = 0; i <= arry.length-1;i++) {
		System.out.println("Layer " + (i+1) + ":");
		for (int j = 0; j <= arry[i].length-1;j++) {
			for (int k = 0; k <= arry[i][j].length-1;k++) {
				System.out.print(arry[i][j][k] + " ");
			}
			System.out.println();	//each 2 number next line 
		}
		System.out.println(); //for next line 
	}
	
	for (int i = 0; i<= arry.length-1; i++) {
		int max = arry[i][0][0];
		
		
		for(int j = 0; j <= arry[i].length-1;j++) {
			for (int k = 0; k <= arry[i][j].length-1; k++) {
				if (arry[i][j][k] > max) {
					max = arry[i][j][k];
				}
			}
		}
		
		System.out.println("Maximun value in layer " + (i+1) + ": " + max);
	}
	
	

}
}
