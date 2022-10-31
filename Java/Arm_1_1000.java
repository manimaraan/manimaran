package Java;

public class Arm_1_1000 {
public static void main(String[] args) {
	for (int i = 1; i <=1000; i++) {
		int n;
		int c =0;
		int rem = 0,res=0;
		n=i;
		
		while (n>0) {
			res=n%10;
			rem=rem+(res*res*res);
			n=n/10;
			
		}
		if (i==rem) {
			c++;
			
		}
		System.out.println(c);
	}
	
}
}
