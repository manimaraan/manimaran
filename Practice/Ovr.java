package Practice;

public class Ovr {
	
	public void virat(String a, String b) {
		System.out.println(a+b);
	}
	
    public void virat(int c,int d) {
		System.out.println(c*d);
	}
    public void virat(boolean f) {
		System.out.println(f);
	}
    public void virat(byte v) {
	System.out.println(v);
}
    public void virat(long l) {
	System.out.println(l);
}
public static void main(String[] args) {
	Ovr aa = new Ovr();
	aa.virat(false);
	aa.virat(-125);
	aa.virat(25646464);
	aa.virat(100, 2);
	aa.virat("Manu", "Sonu");
	
}

}
