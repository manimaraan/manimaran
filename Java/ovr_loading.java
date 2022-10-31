package Java;

public class ovr_loading {
	public void hari(int a,int b,int c) {
		System.out.println(a*b*c);
		
	}
	public void hari(String s, String v, String h) {
		System.out.println(s+" "+v+"  "+h);
	}
	public void hari(char p) {
		System.out.println(p);
	}
	public void hari(boolean l) {
		System.out.println(l);
		
	}
	private short kowsi() {         //return statement
		short k =5001;
		short n=-127;
		if (k<n) {
			return k;
			
		}else {
			return n;
		}
	}
	public static void main(String[] args) {
		ovr_loading hh =new ovr_loading();
		short kowsi = hh.kowsi();
		System.out.println(kowsi);
        hh.hari(80, 70, 60);
        hh.hari("jackson", "danny", "haritha");
        hh.hari('u');
        hh.hari(false);
	}
}
