package sep;

import java.util.Scanner;

public class SampleApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in); 
	Smaple sp = new Smaple();
	
	sp.setData(scan.nextLine());
	System.out.println(sp.getData());
}
}
