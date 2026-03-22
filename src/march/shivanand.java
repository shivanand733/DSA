package march;

import java.util.Scanner;

public class shivanand {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the Size of Arrays ");
	int arry[][] = new int[scan.nextInt()][scan.nextInt()];
	
	for (int i = 0; i <= arry.length-1; i++) {
		for (int j = 0; j <= arry[i].length-1; j++) {
			System.out.println("Enter Values of " + i + "" + j);
			arry[i][j] = scan.nextInt();
		}
	}
	
	int sum = 0;
	for (int i = 0; i <= arry.length-1; i++) {
		int min = arry[i][0];	//rest the value of the J = 0;
		for (int j = 0; j <= arry[i].length-1;j++) {
			if ( arry[i][j] < min ) {
				min = arry[i][j];	
			}
		}
		System.out.println("The Min of row  " + (i+ 1) + " " +min);
		sum += min;
	}
	
	System.out.println("The Sum Of min = " +  sum);
}
}
