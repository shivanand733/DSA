package sep;

import java.util.Scanner;

public class Demo1 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	String str1 = scan.nextLine();
	
	for (int i = 0; i < str1.length();i++) {
		for (int j = i+1;j< str1.length();j++) {
			
			if (str1.charAt(i) == str1.charAt(j)) {
				System.out.println(str1.charAt(i));
				break;
			}
		}
	}
	
	
}
}
