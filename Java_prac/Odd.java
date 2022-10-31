package Java_prac;

import java.util.Scanner;

public class Odd {
	public static void main(String[] args) {
		Scanner ss  = new Scanner(System.in);
		System.out.println("The numbers are");
		int a = ss.nextInt();
		int b = ss.nextInt();
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("The swapping numbers are");
		System.out.println(a);
		System.out.println(b);
	}

}
