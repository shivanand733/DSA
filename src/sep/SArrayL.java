package sep;

import java.util.ArrayList;
import java.util.Scanner;

public class SArrayL {
public static void main(String[] args) {
	AddArryList();
}

public static void AddArryList() {
	Scanner scan = new Scanner(System.in);
	
	//take input length 	
		System.out.println("Enetr Simple Input");
		int sh = scan.nextInt();
		
//		create an Array list 
		ArrayList<Integer> elem = new ArrayList<Integer>();
		
//		add the each elements in the ArrayList
		for (int i = 0; i < sh; i++) {
			elem.add(scan.nextInt());
		}
		

		for (int i = 0; i < elem.size();i++) {
			System.out.println(elem.get(i) + " ");
		}
		
//		create an index and use to get the particuer data 
		System.out.println("Enetr the Index to change the value ");
		int index = scan.nextInt();
		elem.set(index, scan.nextInt());
		
		for (int i = 0; i < elem.size();i++) {
			System.out.println(elem.get(i) + " ");
		}
		
}
}
