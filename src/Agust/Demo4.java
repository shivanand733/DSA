package Agust;
import java.util.Scanner;

public class Demo4 {
	public static void main(String args[]) {
		Scanner Scan = new Scanner(System.in);
		
		shiv sh = new shiv();
		sh.mas();
	}
	
	public static class shiv {
		void mas() {
			String S = "Ramu";			
			for(int i = 0; i <=S.length()-1; i++) {
				System.out.println(S.charAt(i));
			}
		}	
	} 
	
}

