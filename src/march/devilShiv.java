package march;

import java.util.Scanner;

public class devilShiv {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
//	create an 3D Array......
	int arry[][][] = new int[3][][];
	
	System.out.println("1D Arrays  = 2D Arrys");
	//1D array = 2D array
	arry[0] = new int[2][];
	arry[1] = new int[3][];
	arry[2] = new int[4][];
	
	System.out.println("2D array = 1D arrys");
	//creation of the 2D array = 1D array
	arry[0][0] = new int[2];
	arry[0][1] = new int[3];
	
	arry[1][0] = new int[4];
	arry[1][1] = new int[3];
	arry[1][2] = new int[2];
	
	arry[2][0] = new int[3];
	arry[2][1] = new int[3];
	arry[2][2] = new int[4];
	arry[2][3] = new int[2];

	for (int i = 0; i <= arry.length-1;i++) {
		for (int j = 0; j <= arry[i].length-1; j++) {
			for (int k = 0; k <= arry[i][j].length-1; k++) {
				System.out.println("Enter Numbers");
				arry[i][j][k] = scan.nextInt();
			}
		}
	}
	
	for (int i = 0; i <= arry.length-1;i++) {
		for (int j = 0; j <= arry[i].length-1; j++) {
			for (int k = 0; k <= arry[i][j].length-1; k++) {
				System.out.print(arry[i][j][k] + " ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------------");
	}
	
	
	
}
}
