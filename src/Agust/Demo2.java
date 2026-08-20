package Agust;

public class Demo2 {
public static void main(String[] args) {
	
	String s1 = "Kodnest";
	String s2 = s1;
	
	if(s1 == s2) {
		System.out.println("The References will be same");
	} else {
		System.out.println("The Refrences will be Not Same");
	}
	
	System.out.println();
	
	if(s1.equals(s2)) {
		System.out.println("The Content will Be Same");
	} else 
		System.out.println("The Content will be not Same");
	
	System.out.println();
	
	if(s1.equalsIgnoreCase(s2)) {
		System.out.println("The Content Will be same");
	} else {
		System.out.println("The Content Will be Not Same");
	}
}
}
