package Java_prac;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner ss= new Scanner(System.in);
		System.out.println("Enter the number");
		int n = ss.nextInt();
		int fact =n;
		while (n>1) {
			n--;
			fact=fact*n;
			
		}
		System.out.println(fact);
	}

}
