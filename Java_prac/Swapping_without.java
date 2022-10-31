package Java_prac;

import java.util.Scanner;

public class Swapping_without {
public static void main(String[] args) {
	
	Scanner s= new Scanner(System.in);
	System.out.println("the numbers are");
	int a = s.nextInt();
	int b = s.nextInt();
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a);
	System.out.println(b);
}
}
