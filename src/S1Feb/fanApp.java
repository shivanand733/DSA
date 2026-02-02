package S1Feb;

import java.util.Scanner;

public class fanApp {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter total Fans");
	int size = scan.nextInt();
	
	fan[] arry = new fan[size];
	
	System.out.println("Enter Fans Name, Brand and Cost");
	for (int i = 0; i <= arry.length-1; i++) {
		arry[i] = new fan(scan.next(),scan.next(),scan.nextInt());
	}
	
	System.out.println("Details of the All Fans...");
	for (int i = 0; i <= arry.length-1; i++) {
		System.out.println(arry[i].Name + " " + arry[i].Brand + " " + arry[i].cost);
		System.out.println();
	}
}
}
