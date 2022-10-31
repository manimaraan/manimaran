package Suba;

public class overloading1 {
	public void mani(char a) {
		System.out.println(a);
	}
	public void mani(String a,String b) {
		System.out.println(a+"   "+b);
	}
	public void mani(double a) {
		System.out.println(a);
	}	
	public void mani(boolean a) {
		System.out.println(a);

	}
	public void mani(int a, int b,long c) {
		System.out.println(a+b-c);

	}
	public void mani(float a) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		overloading1 boo=new overloading1();
		boo.mani(true);
		boo.mani('N');
		boo.mani(400,450,12000);
		boo.mani("MANI","MARAN");
		boo.mani(123456.12345678912345);
		boo.mani(123456.1151565f);
	}

}
