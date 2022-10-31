package Java;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Tuesday {

	public static void main(String[] args) {
//		Scanner ss = new Scanner(System.in);
//		System.out.println("Enter the number:");
//		int n = ss.nextInt();
//		if (n%2==0) {
//			System.out.println("Even number");
//		} else {
//             System.out.println("Odd number");
//		}
		
//		Scanner ss =new Scanner(System.in);
//		System.out.println("Enter the number:");
//		int n = ss.nextInt();
//	    int count=0;
//	    for (int i = 2; i <=n/2; i++) {
//			if (n%i==0) {
//				count=1;
//				
//			}
//		}
//	    if (count==0) {
//			System.out.println("Prime number");
//		} else {
//              System.out.println("Not a prime number");
//		}
//		
//		int count=0;
//		for (int i = 1; i <=100; i++) {
//			if (i%2==0) {
//				count=count+1;
//			}
//		}
//		System.out.println(count);
//		
//		Scanner ss = new Scanner(System.in);
//		System.out.println("Enter the number:");
//		int n = ss.nextInt();
//		int rem = 0,res,num=0;
//		num=n;
//		while (num>0) {
//			res=num%10;
//			rem=rem+(res*res*res);
//			num=num/10;
//			
//		}
//		if (n==rem) {
//			System.out.println("Armstrong number");
//			
//		} else {
//           System.out.println("Not a armstrong number");
//		}
		
		
//		Scanner ss = new Scanner(System.in);
//		System.out.println("Enter the number:");
//		int n = ss.nextInt();
//		int rem = 0;
//	
//		while (n>0) {
//			rem=(rem*10)+(n%10);
//			n=n/10;
//			
//			
//		}
//		System.out.println(rem);
		
//		String s= "Mani maran likes cricket than mani maran cricket";
//		System.out.println(s);
//		String s1;
//		s1=s.toLowerCase();
//		System.out.println(s1);
//		String[] split = s1.split(" ");
//		for (String string : split) {
//			System.out.println(string);
//		}
//        int count;
//        for (int i = 0; i <= split.length; i++) {
//			count=1;
//			for (int j = i+1; j <= split.length-1; j++) {
//				if (split[i].equals(split[j])) {
//					count++;
//					split[j]="0";
//					
//				}
//			}
//			if (count>1&&split[i]!="0") {
//				System.out.println(split[i]+":"+count);
//				
//			}
//		}
//		
//		Scanner ss = new Scanner(System.in);
//		System.out.println("Enter the number:");
//		int n = ss.nextInt();
//		int n2=n;
//		int rem=0;
//		
//		while (n>0) {
//			rem=(rem*10)+(n%10);
//			n=n/10;
//			
//		}
//		System.out.println(rem);
//		
//		if (n2==rem) {
//			System.out.println("Palindrome number");
//		} else {
//           System.out.println("Not a palindrome number");
//		}
		
//		Scanner ss = new Scanner(System.in);
//		System.out.println("Enter the number:");
//		int n = ss.nextInt();
//		int fact=n;
//		while (n>1) {
//			 n--;
//			 fact=fact*n;
//		}
//		System.out.println(fact);
//		
//		int aa[]=new int[5];
//		aa[0]=1;
//		aa[1]=2;
//		aa[2]=3;
//		aa[3]=4;
//		aa[4]=5;
//		for (int i = 0; i < aa.length; i++) {
//			System.out.println(aa[i]);
//		}
//		for (int i = aa.length-1; i>=0; i--) {
//			System.out.println(aa[i]);
//		}
		
//		int[]a= {55,98,54,46,32,61,106};
//		System.out.println("The odd numbers are");
//		for (int i = 0; i < a.length; i++) {
//			if (a[i]%2!=0) {
//				System.out.println(a[i]);
//			}
//			
//		}
//		System.out.println("The even numbers are");
//		for (int i = 0; i < a.length; i++) {
//			if (a[i]%2==0) {
//				System.out.println(a[i]);
//			}
//		}
		
//		
//		String s="happening in the same way many times";
//		System.out.println(s.length());
//		String[] split = s.split(" ");
//		Map<String, Integer> kk = new LinkedHashMap<String,Integer>();
//		for (int i = 0; i < split.length; i++) {
//			if (kk.containsKey(split[i])) {
//				Integer integer = kk.get(split[i]);
//				kk.put(split[i], integer+1);
//			}
//			else {
//				kk.put(split[i], 1);
//			}
//			
//		}
//		System.out.println(kk);
//		
		
		int count ,c=0;
		for (int i = 1; i <=100; i++) {
			count=0;
			for (int j = 2; j <= i/2; j++) {
				if (i%j==0) {
					count++;
				}
				
			}
			if (count==0) {
				c++;
			}
			
		}
		System.out.println(c);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
