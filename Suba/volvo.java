package Suba;

public class volvo implements hornet,ktm {

	@Override
	public void duke() {
		System.out.println("AVADI");
	}

	@Override
	public void yamaha() {
		int a=450;
		byte b =126;
		System.out.println(a+b);
	}

	@Override
	public void pulsar() {
		char a ='S';
		System.out.println(a);
	}

	@Override
	public void malini() {
		boolean a =false;
		System.out.println(a);
	}

	@Override
	public void priya() {
		String a="JAVA"	;
		String b ="PYTHON";
		System.out.println(a+"   "+b);
	}

	@Override
	public void pushpa() {
	short a =450;
	long b =124255;
	System.out.println(a*b);
	}

	@Override
	public void manoj() {
		System.out.println("VIRAT    KOHLI");		
	}
	
public static void main(String[] args) {
	volvo abc =new volvo();
	abc.priya();
	abc.duke();
	abc.pulsar();
	abc.pushpa();
	abc.manoj();
	abc.malini();
	abc.yamaha();
}
	
	

}
