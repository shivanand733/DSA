package sep;

import java.util.LinkedList;
import java.util.Scanner;

public class SLink {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	//Create  a link List 
	LinkedList ls = new LinkedList();
	ls.add(100);
	ls.add(200);
	ls.add(300);
	ls.add("Om");
	ls.add(3.234);
	
	System.out.println(ls);
	
	
}
}
