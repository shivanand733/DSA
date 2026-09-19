package sep;

import java.util.Scanner;

public class SampleApp {
public static void main(String[] args) {
	
	//This is for the Integer Inputs Only 
	Smaple<Integer> sp = new Smaple<Integer>();
	sp.setData(10);
	sp.setData(30);
	System.out.println(sp.getData());
	
	
	//This is for String Input Only 
	Smaple<String> sp1 = new Smaple<String>();
	sp1.setData("Java Developer");
	System.out.println(sp1.getData());
	sp1.setData("SQL Developer");
	System.out.println(sp1.getData());

	
//	This is for the All Type of the data.
	Smaple sp2 = new Smaple();
	sp2.setData("Shivanand");
	System.out.println(sp2.getData());
	sp2.setData(30);
	System.out.println(sp2.getData());
	
	
}
}
