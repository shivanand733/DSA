package S1Feb;

import java.util.Scanner;

public class collageApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Eneter the size of the String Arrays");

	String[][] arry = new String[scan.nextInt()][scan.nextInt()];	//Arrays Creation 
	
	System.out.println("Enetr The Names");
	for (int j = 0; j <= arry.length-1; j++) {
		for (int i = 0; i <= arry[j].length-1; i++) {
			arry[j][i] = scan.nextLine();
		}
	}
	
	for (int j = 0; j <= arry.length-1;j++) {
		for (int i = 0; i <= arry[j].length-1; i++) {
			System.out.print(arry[j][i] + " ");
		}
		System.out.println();
	}
}
}
