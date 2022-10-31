package Practice;

public class Ovr_ri extends Ovr{
@Override
public void virat(boolean f) {
	int a=10;
	int b=0;
	try {
		System.out.println(a/b);
	} catch (Exception e) {
		System.out.println(e);
	}
	
	super.virat(f);
}
@Override
	public void virat(byte v) {
		short s=152;
		long o=10000;
		System.out.println(o-s);
		super.virat(v);
	}
@Override
	public void virat(int c, int d) {
		byte k=100;
		System.out.println(k);
		super.virat(c, d);
	}
@Override
	public void virat(long l) {
		double p=12345.61616165;
		float t=4646464.64646459459f;
		System.out.println(p+" "+t);
		super.virat(l);
	}
@Override
	public void virat(String a, String b) {
	int n=4512;
		System.out.println(n);
		super.virat(a, b);
	}
public static void main(String[] args) {
	Ovr_ri nn = new Ovr_ri();
	nn.virat(true);
	nn.virat(-126);
	nn.virat(16161);
	nn.virat(50, 60);
	nn.virat("Java", "Python");
}
}
