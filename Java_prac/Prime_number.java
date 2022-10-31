package Java_prac;

import java.util.Scanner;

public class Prime_number {
	public static void main(String[] args) {
		 Scanner ss = new Scanner(System.in);
		 System.out.println("Enter the number:");
		 int n = ss.nextInt();
		 int count=0;
		 for (int i = 2; i <=n/2; i++) {
			 if (n%i==0) {
				 count=1;
				
			}
			
		}
		 if (count==0) {
			 System.out.println("Prime number");
			
		}
		 else {
			System.out.println("Not a prime number");
		}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		}
	}


