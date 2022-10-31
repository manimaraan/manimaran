package Java;

import java.util.Scanner;

public class Sunday {
	public static void main(String[] args) {
//		int count =0;
//		for (int i = 1; i <=50; i++) {
//			if (i%2==0) {
//				count=count+1;
//			}
//			
//		}
//		System.out.println(count);
		
//		Scanner ss = new Scanner(System.in);
//		System.out.println("Enter the number:");
//		int n = ss.nextInt();
//		int fact=n;
//		while (n>1) {
//			n--;
//			fact=fact*n;
//			
//		}
//		System.out.println(fact);
//        Scanner ss = new Scanner(System.in);
//        System.out.println("enter the first number:");
//        int n1 = ss.nextInt();
//        System.out.println("enter the second number:");
//        int n2 = ss.nextInt();
//        for (int i = 0; i <=10; i++) {
//			System.out.println(n1);
//			int n3=n1+n2;
//			n1=n2;
//			n2=n3;
//		}
//		
//		Scanner ss = new Scanner(System.in);
//		System.out.println("Enter the number:");
//		int num = ss.nextInt();
//		int rem=0;
//		int n2=num;
//		while (num!=0) {
//			rem=rem*10+num%10;
//			num=num/10;
//		}
//		System.out.println(rem);
//		if (n2==rem) {
//			System.out.println("palindrome number");
//		} else {
//            System.out.println("Not a palindrome number");
//		}
//		
//        Scanner ss =new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int n = ss.nextInt();
//      
//        int rem = 0,res,num=0;		
//        num=n;
//        while (num!=0) {
//        	res=num%10;
//        	rem=rem+(res*res*res);
//        	num=num/10;
//			
//		}
//        if (n==rem) {
//        	System.out.println("Armstrong number");
//			
//		} else {
//            System.out.println("Not a armstrong number");
//		}
		
		
		int count=0;
		for (int i = 1; i <=1000; i++) {
			int rem=0;
			int num=i;
			while(num!=0) {
				rem=rem*10+num%10;
				num=num/10;
			}
			if (i==rem) {
				count++;
			}
		}
		
		System.out.println(count);
		
		
		
		
		
		
	}

}
