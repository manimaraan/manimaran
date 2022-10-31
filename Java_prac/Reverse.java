package Java_prac;

import java.util.Scanner;

public class Reverse {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter a number:");
	int num = sc.nextInt();
	int rev=0;
	int n2=num;
	while (num!=0) {
		rev=rev*10 +num%10;
		num =num/10;
		
	}
	System.out.println("reverse numbers are:"+rev);
    if (n2==rev) {
		System.out.println("Palindrome number");
	} else {
         System.out.println("Not a palindrome number");
	}	
}
}
