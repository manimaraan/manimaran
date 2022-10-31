package Java_prac;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
//		int first=0;
//		int second=1;
//		for (int i = 0; i <=8; i++) {
//			System.out.println(first); 
//		     int third=first+second;            
//		     first= second;                 
//		     second= third;                 
//		
			
//		}
		
		Scanner ss =new Scanner(System.in);
		System.out.println("Enter the first number");
		int n1 = ss.nextInt();
		System.out.println("Enter the second number");
		int n2 = ss.nextInt();
		for (int i = 0; i <10; i++) {
			System.out.println(n1);
			int n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		
		
	}

}
