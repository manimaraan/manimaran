package Java_prac;

import java.util.Scanner;

public class Rev_num_palindrome {
public static void main(String[] args) {
	Scanner ss = new Scanner(System.in);
	System.out.println("enter the number:");
	int n = ss.nextInt();
	int n2=n;
	int rem=0;
	while (n>0) {
		rem=(rem*10)+(n%10);
		n=n/10;
		
	}
	System.out.println(rem);
	if (n2==rem) {
		System.out.println(n2+"given number is palindrome number");
		
	}else {
		System.out.println(n2+"not a palindrome number");
	}
}

}
