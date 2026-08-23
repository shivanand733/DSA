package Agust;

public class Demo3 {
public static void main(String[] args) {
	String s1 = "Kodnest";
	
	System.out.println(s1);
//	s1.concat("Academy"); //Strings Are Immutable 
	s1=s1.concat("Academy");
	System.out.println(s1);
}
}