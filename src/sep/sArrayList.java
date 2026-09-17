package sep;

import java.util.ArrayList;
import java.util.Scanner;

public class sArrayList {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enetr the size of array");
	int sh = scan.nextInt();
	
	//create an Array List 
	
	ArrayList<Integer> elem = new ArrayList<Integer>();
	
	System.out.println("Eneter the Numbers");
	for (int i = 0; i < sh; i++) {
		elem.add(scan.nextInt());
	}
	
	System.out.println("Size of Array list: " + elem.size());
	
	System.out.print("Elements are ");
	
	for (int i = 0; i < elem.size(); i++) {
		System.out.print(elem.get(i) + " ");
	}
}
}
