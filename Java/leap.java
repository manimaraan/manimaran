package Java;

import java.util.Scanner;

public class leap {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the year:");
		int n = ss.nextInt();
		
		if (n%4==0 && n%100!=0 || n%400==0) {
			System.out.println("is is a leap year");
		}
		else {
			System.out.println("it not a leap year");
		}
	}

}
