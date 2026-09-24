package sep;

import java.util.Scanner;

public class penApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	Pen p1 = new Pen();
	p1.id=100;
	p1.color = "Blue";
	
	Pen p2 = new Pen();
	p2.id = 200;
	p2.color = "Red";
	
	Pen p3 = new Pen();
	p3.id = 100;
	p3.color = "Blue";
	
	
	System.out.println(p1.equals(p2));
	System.out.println(p1.equals(p3));
	System.out.println(p1.equals(p1));

}
}
