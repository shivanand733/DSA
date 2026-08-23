package Agust;

import java.util.Scanner;

public class Demo5 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	String Sb = new String("Shiv");
	System.out.println(Sb);
	
	//Convert into Char Array 
	char arr1[] = Sb.toCharArray();
	
	// An Empty String Array, Length Should be the same as the arr1
	char arr2[] = new char[arr1.length]; 
	
	int j = arr2.length-1;
//	System.out.println(j); // Test purpose
	
	for (int i = 0; i <= arr1.length-1; i++) {
		arr2[j] = arr1[i];
		j--;
	}
	
	System.out.println(arr2);
	
	//Reverse String using the Char array...
	
	
}
}
