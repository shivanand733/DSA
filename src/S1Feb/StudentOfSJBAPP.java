package S1Feb;

import java.util.Scanner;

public class StudentOfSJBAPP {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter Total Number of students");
	int size = scan.nextInt();
	//Array Creation 
	StudentOfSJB[] arry = new StudentOfSJB[size];
	
	System.out.println("Enter  StudentId, First Name , Last Name, Register Number, Address, Branch, Year of Passout");
	for (int i = 0; i <= arry.length-1; i++) {
		arry[i] = new StudentOfSJB();
		arry[i].studentId = scan.nextInt();
		arry[i].FirstName = scan.next();
		arry[i].Lastname = scan.next();
		arry[i].RegisterNo = scan.next();
		arry[i].Address = scan.nextLine();
		arry[i].Branch = scan.next();
		arry[i].yearOfPassOut = scan.nextInt();
	}
	
	for (int i = 0; i <= arry.length-1; i++) {
		System.out.println("Student ID" + arry[i].studentId);
		System.out.println("First name "+ arry[i].FirstName );
		System.out.println("Last Name " + arry[i].Lastname);
		System.out.println("Register Number " + arry[i].RegisterNo );
		System.out.println("Address " + arry[i].Address);
		System.out.println("Branch " + arry[i].Branch);
		System.out.println("Year Of Passout " + arry[i].yearOfPassOut);
	}
}
}
