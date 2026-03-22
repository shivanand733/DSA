package march;

import java.util.Scanner;

public class sumOFMin1 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
//	Arrays Creation
	System.out.println("Enter Size of Arrays");
	int[][] arry = new int[scan.nextInt()][scan.nextInt()];
	
	for (int i = 0; i <= arry.length-1;i++) {
		for (int j = 0; j <= arry[i].length-1; j++) {
			System.out.println("Enter Marks " + i + " " + j);
			arry[i][j] = scan.nextInt();
		}
	}
int sum;
	for (int i = 0; i <= arry.length-1; i++) {
		 int min = arry[i][0];		// reset for Each row 
		for (int j = 0; j <= arry[i].length -1;j++) {
			if (arry[i][j] < min) {
				min = arry[i][j];
			}
		}
		System.out.println("The min of the each row :" + min);
		
	}
	
}
}
