package march;

import java.util.Scanner;

public class Avarge3DArray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Size of Arrays");
	
//	Creation Of the 3D Array
	int arry[][][] = new int[scan.nextInt()][scan.nextInt()][scan.nextInt()];
	
	for (int i = 0; i <= arry.length-1; i++) {
		for(int j = 0; j <= arry[i].length-1; j++) {
			for (int k = 0; k <= arry[i][j].length-1;k++) {
				arry[i][j][k] = scan.nextInt();
			}
		}
	}
	
//	find the Avarage of the each row 
	for (int i = 0; i <= arry.length-1; i++) {
		
		for(int j = 0; j <= arry[i].length-1; j++) {
			for (int k = 0; k <= arry[i][j].length-1;k++) {
				
			}
		}
	}
	
	
}
}
