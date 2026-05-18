package may;

import java.util.Scanner;

public class StringBufferS1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Using String Buffer
		System.out.println("Enter the 3 Words!");
		StringBuffer s1 = new StringBuffer();
		s1.append(scan.nextLine());
		s1.append(scan.nextLine());
		s1.append(scan.nextLine());
		
		System.out.println("The Concated String " + s1 + ".");
	}
}
