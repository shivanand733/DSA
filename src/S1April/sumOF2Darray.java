package S1April;

import java.util.Scanner;

public class sumOF2Darray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
//	create an 3D Array 
	System.out.println("Enetr The Size of Array: ");
	int arry[][][] = new int[scan.nextInt()][scan.nextInt()][scan.nextInt()];
	
	
	System.out.println("Enter The Numbers ");
	for (int i = 0;i <= arry.length-1; i++) {
		for (int j = 0; j <= arry[i].length-1; j++) {
			for (int k = 0; k <= arry[i][j].length-1; k++) {
				arry[i][j][k] = scan.nextInt();
			}
		}
	}
	
	for(int i = 0; i <=arry.length-1; i++) {
		for (int j = 0; j <= arry[i].length-1; j++) {
			for (int k = 0; k <= arry[i][j].length-1; k++) {
				System.out.println("Arrays Are: " + arry[i][j][k]);
			}
		}
		System.out.println();
	}
}
}
