package S1Feb;

import java.util.Scanner;

public class Employee {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter Number Of 'Office' and in each office how may 'employees' is there..");
	int Office = scan.nextInt();
	int Emp = scan.nextInt();
	//create an arrays
	String [][] arry = new String[Office][Emp];
	
	System.out.println("Add the details of the Employee");
	for (int j = 0; j <= arry.length-1;j++) {
		for (int i = 0; i <= arry[i].length-1;i++) {
			arry[j][i] = scan.next();
		}
	}
	
	System.out.println("Print the Details of the Employee..");
	for (int j = 0; j <= arry.length-1; j++) {
		for (int i = 0; i <= arry[i].length-1; i++) {
			System.out.print(arry[j][i] + " ");
		}
		System.out.println();
	}
}
}
