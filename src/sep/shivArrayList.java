package sep;
import java.util.Scanner;
import java.util.ArrayList;
public class shivArrayList {
public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	
	ArrayList al = new ArrayList();
	al.add(100);
	al.add(200);
	al.add(300);
	al.add(400);
	al.add("Raju");
	al.add("Ramu");
	al.add(3.14f);
	al.add(true);
	al.add('S');
	
	al.add(4,"Om Ramu gurav");
	
	System.out.println(al);
}
}
