package S1Feb;

import java.util.Scanner;

public class shivMicroNovaApp {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Eneter Employee Id Number");
	System.out.println("Eneter Employee Name");
	System.out.println("Eneter Employee Department");
	System.out.println("Eneter Employee Department Head");
	
	shivMicroNova shiv = new shivMicroNova(scan.nextInt(), scan.nextLine()+ scan.nextLine(), scan.nextLine(), scan.nextLine());
	
	
	System.out.println(shiv);
}
}
