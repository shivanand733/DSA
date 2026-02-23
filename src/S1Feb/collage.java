package S1Feb;

import java.util.Scanner;

public class collage {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter Number of classs and students in each class");
		
		int arry[][] = new int[scan.nextInt()][scan.nextInt()];
		
		System.out.println("Enter the NUmbers");
		for (int j = 0; j <= arry.length-1; j++) {
			for (int i = 0; i <= arry[j].length-1; i++) {
				arry[j][i] = scan.nextInt(); 
			}
		}
		
		for (int j = 0; j <= arry.length-1; j++) {
			for (int i = 0; i <= arry[j].length-1; i++) {
				System.out.print(arry[j][i] + " ");
			}
			System.out.println();
		}
	}
}
