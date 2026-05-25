package may;

import java.util.Scanner;

public class shiv {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String s1 = "kod";
	String s2 = "Nest";
	String s3 = "Kod" + "Nest";
	String s4 = "Kod" + "Nest";
	String s5 = s1 + s2;
	String s6 = s1 + s2;
	
	if(s3 == s4) {
		System.out.println("The reference are Equal");
	} else {
		System.out.println("The Reference Are Unequal");
	}
	
	System.out.println("----------------------------------------------");
	if(s3.equals(s4)) {
		System.out.println("The Content Will be the Same");
	} else {
		System.out.println("The Content Will not Same");
	}
	
	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	
	if(s5 == s6) {
		System.out.println("The reference are Equal");
	} else {
		System.out.println("The Reference Are Unequal");
	}
	
	System.out.println("----------------------------------------------");
	if(s5.equals(s6)) {
		System.out.println("The Content Will be the Same");
	} else {
		System.out.println("The Content Will not Same");
	}
}
}
