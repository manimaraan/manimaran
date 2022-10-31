package Java;


public class prime_number {
	public static void main(String[] args) {
		 int no =5;
		 int count =0;
		 for (int i = 2; i < no; i++) {
			 if (no/i==0) {
				 count++;
				
			}
			
		}
		 if (count>0) {
			 System.out.println("given number is not prime");
			
		}else {
			System.out.println("given number is prime");
		}
}
}
