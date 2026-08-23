package Agust;
import java.util.Scanner;

public class Shiv230826A {
	public static void main(String Args[]) {

		new DemoBilder().Message();
	}
	
	public static class DemoBilder {
		void Message(){
		StringBuilder sb1 = new StringBuilder();
		
		sb1.append("Hello");
		sb1.append(" Java Learners");
		sb1.append(" Welcome back....");
		
		System.out.println("The String Builder using Appends Are " + sb1);
		
		System.out.println(sb1.capacity());
		}
	}
}
