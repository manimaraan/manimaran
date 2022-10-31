package Java_prac;

public class Harshal extends Bumrah {
	
	@Override
	public void bhuvi() {
		 int i =1;
		for ( i = 1; i <=50; i++) {
			if (i>0 || i<2) {
				System.out.println(i++);
			}
			System.out.println("loppinggggggggggggggg");
		}
		super.bhuvi();
	}
	@Override
	public void hari() {
		System.out.println("metrooooooooooooo");
		super.hari();
	}

	@Override
	public void hardik() {
		System.out.println("avadi");
		
	}

	@Override
	public void jaddu() {
		System.out.println("chennai");
		
	}
	
public static void main(String[] args) {
	Harshal gg = new Harshal();
	gg.hardik();
	gg.jaddu();
	gg.bhuvi();
	gg.hari();
}
}
