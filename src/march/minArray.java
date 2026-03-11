package march;

import java.util.Scanner;

public class minArray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Size of Array.");
	
//	Arrays Creation 
	int[] array = new int[scan.nextInt()];
	
	for (int i = 0; i <= array.length-1; i++) {
		System.out.println("Enter Numbers "  + i);
		array[i] = scan.nextInt();
	}
	int min = array[0];
	for (int i = 1; i <= array.length-1; i++) {
		if (array[i] < min ) {
			min = array[i];
		}
	}
	
	System.out.println("The Min Value In the Arrays is " + min);
}
}
