package Java_prac;

public class Arr {
	public static void main(String[] args) {
		int aa[]=new int[4];
		String bb[]= {"chennai","bangalore","hyderabad","mumbai"};
		aa[0]=1;
		aa[1]=2;
		aa[2]=3;
		aa[3]=4;
		
		System.out.println(bb[3]);
		for (int i = 0; i < bb.length; i++) {
			System.out.println(bb[i]);
		}
	}

}
