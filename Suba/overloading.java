package Suba;

public class overloading {
	public void sneha(int s) {
		System.out.println(s);
	}
	public void sneha(double v, long y) {
		System.out.println(v+" "+y );
	}
	public void sneha(String a,String b, String c) {
		System.out.println(a +"2" + b +"4" + c);
	}
	public void sneha(char d,char e) {
		System.out.println(d+"   "+e);
	}
	public void sneha(float h) {
		System.out.println(h);
		
	}
	public void sneha(boolean t) {
		System.out.println(t);
		
	}
	public static void main(String[] args) {
		overloading wc=new overloading();
		wc.sneha(130);
		wc.sneha(1646464.16464646f);
		wc.sneha('m', 'n');
		wc.sneha(6945956.64646464646546, 1641);
		wc.sneha("down", "give", "hut");
		wc.sneha(true);
		
	}
	

}
