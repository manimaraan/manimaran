package Java;

import java.util.Scanner;

public class Arm {
public static void main(String[] args) {
	Scanner ss = new Scanner(System.in);
	System.out.println("Enter the number:");
	int n = ss.nextInt();
	int rem=0;
	
	while (n>0) {
		rem=(rem*10)+(n%10);
		n=n/10;
	}
	System.out.println(rem);
	int n2=n;
	if (n2==rem) {
		System.out.println("it is a palindrome number");
		
	}else {
		System.out.println("it not a palindrome number");
	}
}
}
