package march;

import java.util.Scanner;

public class threeD {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the value of 's' 'h' and 'v' ");
	int s = scan.nextInt();
	int h = scan.nextInt();
	int v = scan.nextInt();
	
	//array creation 
	int[][][] arry = new int[s][h][v];
	
	System.out.println("Enter the marks of the each students");
	for (int i = 0; i <= arry.length-1; i++) {
		for (int j = 0; j <= arry[i].length-1; j++) {
			for (int k = 0; k <= arry[i][j].length-1; k++) {
				arry[i][j][k] = scan.nextInt();
			}
		}
	}
	
	System.out.println("The output are....");
//	Printing the outputs
	for (int i = 0; i <= arry.length-1; i++) {
		for (int j = 0; j <= arry[i].length-1; j++) {
			for (int k = 0; k <= arry[i][j].length-1; k++) {
				System.out.print(arry[i][j][k] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	}
}
