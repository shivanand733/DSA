package Agust;
import java.util.Scanner;
public class SDemo1 {
public static void main(String[] args) {
	Scanner Scan = new Scanner(System.in);
	System.out.println("Eneter String / name ");
	String str = Scan.nextLine();
	
	System.out.println("Enter number");
	System.out.println(str.substring(Scan.nextInt()));
	
	System.out.println("Eneter the 2 numbers start and end");
	System.out.println(str.substring(Scan.nextInt(),Scan.nextInt()));
}
}
