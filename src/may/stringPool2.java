package may;

public class stringPool2 {
public static void main(String[] args) {
	String s1 = "kodnest";
	String s2 = s1; 
	
	if (s1 == s2) {
		System.out.println("The References Are Equal");
	} else  {
		System.out.println("The References Are Unqual");
	}
	
	System.out.println("---------------------------------------------");
	
	if (s1.equals(s2)) {
		System.out.println("The Content will be equal ");
	} else {
		System.out.println("The Content will be not Equal");
	}
}
}
