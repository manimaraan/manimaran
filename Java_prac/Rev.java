package Java_prac;

import java.util.Scanner;

public class Rev {
public static void main(String[] args) {
//Scanner s=new Scanner(System.in);
//System.out.println("Enter the number");
//int n = s.nextInt();
	int c=0;
	for (int  n = 1;n<=1000; n++) {
		int i=0;
		int j=0;
		int a;
		
		a=n;
		
		while (a>0) {
			i=a%10;
			j=(j*10)+i;
			a=a/10;
			
	}
		if (n==j) {
			c++;
			

	
}

}
	
	System.out.println(c);
	
}
}



			

