package S1Jan;

import java.util.Scanner;

public class StudentList {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter Number");
	int size = scan.nextInt();
	
	int[] arry = new int[size];
	
	System.out.println("Enter "+ size + " Student Marks: ");
	for (int i = 0; i <= arry.length-1; i++) {
		arry[i] = scan.nextInt();
	}
	
	for (int i = 0; i <= arry.length-1;i++) {
		System.out.print("Student Marks  " + arry[i] + " ");
	}
}
}
