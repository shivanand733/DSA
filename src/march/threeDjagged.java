package march;

import java.util.Scanner;

public class threeDjagged {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
//	3D Array Creation 
	int [][][] arry = new int[3][][];
	
	 arry[0] = new int[3][];
	 arry[1] = new int[2][];
	 arry[2] = new int[4][];
	 
	 arry[0][3] = new int[5];
	 arry[1][2] = new int[3];
	 arry[3][4] = new int[4];
	 
	 for (int i = 0; i <= arry.length-1; i++) {
		 for (int j = 0; j <= arry[i].length-1; j++) {
			 for (int k = 0; k <= arry[i][j].length-1;k++) {
				 arry[i][j][k] = scan.nextInt();
			 }
		 }
	 }
	 
	 for (int i = 0; i <= arry.length-1; i++) {
		 for (int j = 0; j<= arry[i].length-1; j++) {
			 for (int k = 0; k <= arry[i][j].length-1; k++) {
				 System.out.println(arry[i][j][k] + " ");
			 }
			 System.out.println();   	//the Line breaker
		 }
		 System.out.println("----------------------------------------------"); //one complete loop is complete..
	 }
}
}
