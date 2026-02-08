package S1Feb;

import java.util.Scanner;

public class bookApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the size of the book ");
	int size = scan.nextInt();
	book[] arry = new book[size];
	
	System.out.println("Enetr Book Name and its Cost");
//	for (int j = 0; j <= arry.length-1; j++) {
		for (int i = 0; i <= arry.length-1; i++) {
			arry[i]= new book(scan.next(), scan.nextInt());
		}
//	}
	
		System.out.println("The details of the Book and cost ");
//	for (int j = 0; j <= arry.length-1; j++) {
		for (int i = 0; i <= arry.length-1; i++) {
			System.out.println(arry[i]+ " ");
		}
		
//	}
	
}
}
