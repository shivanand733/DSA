package may;

public class StringPool1 {
public static void main(String[] args) {
	
	String s1 = "Kod";
	String s2 = "Nest";
	String s3 = "kod" + "Nest";
	String s4 = "kod" + "Nest";
	String s5 = s1+ s2;
	String s6 = s1+ s2;
	
	if (s3 == s4) {
		 System.out.println("The refernces Are Same");
	} else {
		System.out.println("The Reference Are not Same..");
	}
	
	if (s3.equals(s4)) {
		System.out.println("The Contet Willl be Same");
	} else  {
		System.out.println("The Contet not match Or Not Same");
	}
	
	System.out.println("-------------------------------------------");

	if (s5 == s6) {
		 System.out.println("The refernces Are Same");
	} else {
		System.out.println("The Reference Are not Same..");
	}
	
	if (s5.equals(s6)) {
		System.out.println("The Contet Willl be Same");
	} else  {
		System.out.println("The Contet not match Or Not Same");
	}
	
	System.out.println("-------------------------------------------");

}
}
 