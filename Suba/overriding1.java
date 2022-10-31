package Suba;

public class overriding1 extends overloading1 {
	@Override
	public void mani(boolean a) {
	   long c =450;
	   int b =451;
	System.out.println(c+b);
		super.mani(a);
	}
	@Override
	public void mani(char a) {
		short d =500;
		int v =490;
		System.out.println(d-v);
		super.mani(a);
	}
	@Override
	public void mani(double a) {
		char i ='M';
		System.out.println(i);
		super.mani(a);
	}
	@Override
	public void mani(float a) {
		byte f =-128;
		long g =2646;
		System.out.println(g+f);
		super.mani(a);
	}
	@Override
	public void mani(int a, int b, long c) {
		float z=56464646.646464f;
        System.out.println(z);
		super.mani(a, b, c);
	}
	@Override
	public void mani(String a, String b) {
		String p ="MARAN";
		String q = "MANI";
		System.out.println(p+q);
				super.mani(a, b);
	}
	public static void main(String[] args) {
		overriding1 ms = new overriding1();
		
				ms.mani(true);
				ms.mani('F');
				ms.mani(46466464646.164654646464646464);
				ms.mani(2161646546.6516546f);
				ms.mani("cricket","worldcup");
				ms.mani(500, 489, 12000);
	}

}
