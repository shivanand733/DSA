package Agust;

import java.util.Scanner;

public class Demo3 {
public static void main(String[] args) {
//	shiv();
//	shiv1();
//	shiv2();
	redex001();
}

public static  void shiv() {
Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter String: ");
	String str1 = scan.nextLine();
	
	String[] word = str1.split(" ");
	String result = " ";
	
	for (int i = 0; i < word.length;i++) {
		result = result + Character.toUpperCase(word[i].charAt(0)) 
		+ word[i].substring(1).toLowerCase() + " ";
	}
	
	System.out.println("The Original String: " + str1);
	System.out.println("The Title Case: " + result);

}

public static void shiv1() {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enetr any two strings");
	String str1 = scan.nextLine();
	String str2 = scan.nextLine();
	
	if(str1.length() == str2.length()  && (str1 + str1).contains(str2)) {
		System.out.println("The string " + str2 + " is a rotation of " + str1);
	} else {
		System.out.println("The string " + str2 + " is Not a rotation of " + str1);
	}
	
}

public static void shiv2() {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Eneter string");
	String str1 = scan.nextLine();
	
	for (int i = 0; i <= str1.length()-1; i++) {
		
		int rep = 0;
		for (int j = 0; j <= str1.length()-1; j++) {
			if (str1.charAt(i) == str1.charAt(j)) {
				rep++;
			}
		}
		System.out.println(str1.charAt(i) + ": "+ rep + ",  ");
		
	}
}

public static void redex001() {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter String");
	String str = scan.nextLine();
	
	String rex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
	
	if(str.matches(rex)) {
		System.out.println("Valied String");
	} else {
		System.out.println("Invalied String");
	}
}

}