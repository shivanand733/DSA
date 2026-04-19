package S1April;

import java.util.Scanner;

public class shiv {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
//	Create an Arrays 
	System.out.println("Enter The Size of Arrys");
	int arry[][][] = new int[scan.nextInt()][scan.nextInt()][scan.nextInt()];
	
	for (int i = 0; i <= arry.length-1; i++) {
		for (int j  = 0; j <= arry[i].length-1; j++) {
			for (int k = 0; k <= arry[i][j].length-1; k++) {
				arry[i][j][k] = scan.nextInt();
			}
		}
	}
	

}
}
