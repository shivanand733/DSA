package march;

import java.util.Scanner;

public class transfose {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	System.out.println("Enter the Size of the Arrays"); 
	int row = scan.nextInt();
	int colm = scan.nextInt();
	
	int arry[][] = new int [row][colm];
	for (int i  = 0; i <= arry.length-1; i++) {
		for (int j = 0; j <= arry[i].length-1; j++) {
			System.out.println("Enter Numbers" + i + " " + j);
			arry[i][j] = scan.nextInt();
		}
	}
	
	int trans[][] = new int[colm][row];
	for (int i = 0; i <= arry.length-1;i++) {
		for (int j = 0; j<= arry[i].length-1;j++) {
			trans[j][i] = arry[i][j];
		}
	}
	
	System.out.println("The Original Arrays");
	for (int i = 0; i <= arry.length-1; i++) {
		for (int j = 0; j <= arry[i].length-1;j++) {
			System.out.print(arry[i][j] + " ");
		}
		System.out.println();
	}
	
	System.out.println("Transpose Matrixs");
	for (int i = 0; i <= trans.length-1;i++) {
		for (int j = 0; j <= trans[i].length-1;j++) {
			System.out.print(trans[i][j] + " ");
		}
		
		System.out.println();
	}

}
}
