package Java_prac;

import java.util.Scanner;

public class Leap_year {
public static void main(String[] args) {
	Scanner ss =new Scanner(System.in);
    System.out.println("Enter the year:");
    int year = ss.nextInt();
    if (year%400==0) {
    	System.out.println("It is a leap year");
		
	}
    else if (year%100!=0) {
		System.out.println("It is not a leap year");
	}
    else if (year%4==0) {
		System.out.println("It is a leap year");
	}else
		System.out.println("*************");
    
}
}
