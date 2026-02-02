package S1Jan;

import java.util.Scanner;

public class salarry {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter Number Of the Employee");
	int NoOFEmp = scan.nextInt();
	
	System.out.println("Entr Sallary of Each Employees");
	int[] arry = new int[NoOFEmp];
	
	for (int i = 0; i <= arry.length-1; i++) {
		 arry[i] = scan.nextInt();
	}

	for (int i = 0; i <= arry.length-1; i++) {
		System.out.println("Bounus 1000 + Sallary is " + (arry[i] + 1000) + " ");
	}
}
}
