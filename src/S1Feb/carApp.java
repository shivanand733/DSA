package S1Feb;

import java.util.Scanner;

public class carApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	 car[] arry = new car[6];
	 
	 System.out.println("Enter the car Brand and cost...");
	 for (int i = 0; i <= arry.length-1;i++) {
		 arry[i] = new car();
		 arry[i].brand = scan.next();
		 arry[i].cost = scan.nextInt();
	 }
	 
	 for (int i = 0; i <= arry.length-1; i++) {
		 System.out.println("Car's brand " + arry[i].brand + " and cost " + arry[i].cost);;
	 }
	 
}
}
