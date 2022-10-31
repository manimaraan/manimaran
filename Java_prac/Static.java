package Java_prac;

public class Static {
	static int s=100;
	
private  void rahul() {
int r=4;
System.out.println(this.s*r);

}
public static void main(String[] args) {
	Static rr =new Static();
	rr.rahul();
}
}
