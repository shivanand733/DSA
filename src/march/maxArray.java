package march;

import java.util.Scanner;

public class maxArray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	//Array creation 
	System.out.println("Enter the size of the Array");
	int [] array = new int[scan.nextInt()];
	
	for (int i = 0; i <= array.length-1; i++) {
		System.out.println("Enter the Arrys " + i );
		array[i] = scan.nextInt();
	}
	
	int max = 0;
	for (int i = 0; i <= array.length-1; i++) {
		if (array[i] >= max) {
			max = array[i];
		}
	}
	System.out.println(" The Max of the value is " + max);

}
}
