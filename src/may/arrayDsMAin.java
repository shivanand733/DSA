package may;

import java.util.Scanner;

public class arrayDsMAin {
public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 
	 stackDS ds = new stackDS(5);
	 ds.push(100);
	 ds.push(200);
	 ds.push(300);
	 ds.push(400);
	 ds.push(500);
	 
	 ds.push(600);		//The Stack is Full
	 ds.push(700);		//The Stack is Full
	 ds.dispaly();
	 
	 System.out.println("-------------------------------------------------");
	 
	 ds.pop();
	 System.out.println("end");
	 
}
}
