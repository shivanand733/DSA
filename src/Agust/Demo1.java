package Agust;

public class Demo1 {
public static void main(String[] args) {
	
	String S1 = "Shivu";
	String S2 = "sHivU";
	
	System.out.println();
	System.out.println("Using == ");
	if(S1 == S2) {
		System.out.println("The Reference are Equal");
	} else {
		System.out.println("The References are Un Equal");
	}
	
	System.out.println();
	System.out.println("Using .equals() ");
	
	if(S1.equals(S2)) {
		System.out.println("The  Content Will be Same in case statement");
	} 
	else {
		System.out.println("The Content will be Not Same in case Statement");
	}
	
	System.out.println();
	System.out.println("Using .equalsIgnoreCase ");
	
	if(S1.equalsIgnoreCase(S2)) {
		System.out.println("The Content will be the same");
	} 
	else {
		System.out.println("The Content will be Not same");
	}
}
}
