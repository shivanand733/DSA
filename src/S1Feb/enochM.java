package S1Feb;

import java.util.Scanner;

public class enochM {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Size of the Rows only");
	int row = scan.nextInt();
	int colum = scan.nextInt();
	
	int[][] Jarry = new int[row][colum];
	
	System.out.println("the size of " + row + " and add the column");
	for (int j = 0;j <= Jarry.length-1;j++) {
		for (int i = 0; i <= Jarry[i].length-1;i++) {
			Jarry[j][i] = scan.nextInt();
		}
	}
	
	System.out.println("The output of the arrys are ");
	for (int j = 0; j <= Jarry.length-1; j++) {
		for (int i = 0; i <= Jarry[i].length-1; i++) {
			System.out.print(Jarry[j][i] + " ");
		}
		System.out.println();
	}
}
}
