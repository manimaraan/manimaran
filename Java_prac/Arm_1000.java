package Java_prac;

public class Arm_1000 {
	public static void main(String[] args) {
		int count =0;
		for (int i = 1; i <=500; i++) {
			int rem=0;
			int res=0;
			int n;
			n=i;
			while (n>0) {
				res=n%10;
				rem=rem+(res*res*res);
				n=n/10;
				
			}
			if (i==rem) {
				count++;
				
			}
		}
		System.out.println(count);
	}
	

}
