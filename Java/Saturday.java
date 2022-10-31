package Java;

import java.util.Scanner;

public class Saturday {
public static void main(String[] args) {
//	Scanner ss= new Scanner(System.in);
//	System.out.println("Enter the number:");
//	int n = ss.nextInt();
//	int res,rem = 0,num=0;
//	num=n;
//	while (num!=0) {
//		res=num%10;
//		rem=rem+(res*res*res);
//		num=num/10;
//		
//		
//	}
//	if (n==rem) {
//		System.out.println("Armstrong number");
//		
//	} else {
//       System.out.println("Not a armstrong number");
//	}
	
//	Scanner ss = new Scanner(System.in);
//	System.out.println("enter the number:");
//	int n = ss.nextInt();
//	int count=0;
//	for (int i = 2; i <=n/2; i++) {
//		if (n%i==0) {
//			count=1;
//		}
//	}
//	if (count==0) {
//		System.out.println("Prime number");	
//		}
//	else {
//		System.out.println("Not a prime number");
//	}
	
//	Scanner ss=new Scanner(System.in);
//	System.out.println("Enter the number:");
//	int n = ss.nextInt();
//	if (n%2==0) {
//		System.err.println("Even number");
//		
//	}
//	else {
//		System.out.println("Odd number");
//	}
	
	Scanner ss= new Scanner(System.in);
	System.out.println("Enter the string:");
	String str = ss.nextLine();
	String rev="";
	String[] split = str.split(" ");
	for (int i = str.length()-1; i>=0; i--) {
		char ch=str.charAt(i);
		rev=rev+ch;
	}
	System.out.println(rev);
	String[] split2 = rev.split(" ");
	for (String string : split2) {
		System.out.println(string);
	}
}
}
