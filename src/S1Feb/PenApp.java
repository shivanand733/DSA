package S1Feb;

import java.util.Scanner;

public class PenApp {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the size of the Arrys");
	int size = scan.nextInt();
	
	Pen arr[] = new Pen[size];
	
	for (int i = 0 ; i <= arr.length-1; i++) {
		System.out.println("Create a object of the pen " + i + " class");
		arr[i] = new Pen();
		
		System.out.println("Enter the Name, cost and Pen Type ");
		arr[i].name = scan.next();
		arr[i].cost = scan.nextInt();
		arr[i].penType = scan.next();
	}
	
	for (int i = 0; i <= arr.length-1; i++) {
		System.out.println("The Pen deltais..");
		System.out.println(arr[i].name + " Cost is " + arr[i].cost + " and pen type is" + arr[i].penType);
	}
 	
}
}
