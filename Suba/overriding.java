package Suba;

public class overriding extends overloading {
	@Override
	public void sneha(boolean t) {                  
		int a = 450;
		short b = 10;
		System.out.println(a/b);
		super.sneha(t);
	}
	@Override
	public void sneha(char d, char e) {
		byte a=123;
		long b =12000;
		System.out.println(a+b);
		super.sneha(d, e);
	}
	@Override
	public void sneha(double v, long y) {
		 char a ='V';
		 System.out.println(a);
		super.sneha(v, y);
	}
	@Override
	public void sneha(float h) {
		boolean a =true;
		System.out.println(a);	
		super.sneha(h);
	}
	@Override
	public void sneha(int s) {
	     double b=2111.313165464631313;
	     double a =4646.664646464646466;
	     System.out.println(a/b);
		super.sneha(s);
	}
	public static void main(String[] args) {
		overriding vk =new overriding();
		vk.sneha(true);
		vk.sneha('M','S');
		vk.sneha(11116464616.31616165466146, 20000);
		vk.sneha(131313131.131316166f);
		vk.sneha(500);
		
	}
	
}
