package Java;

public class Abs_123 extends Abs_demo{
	
	private long yuvi() {
		char u='M';
		String o="karthick";
		System.out.println(u+" "+o);
		long s=400;
		long g=5600;
		if (s+g>5000) {
			return g;
			
		}else {
			return s;
		}
	}

	@Override
	public void john() {
		System.out.println("joesph");
		
	}

	@Override
	public void gargi() {
		System.out.println("saipallavi");
	}
	@Override
	public void priya() {
		System.out.println("dharshini");
		super.priya();
	}
	@Override
	public void nandha() {
		System.out.println("kumar");
		super.nandha();
		
	}
	public static void main(String[] args) {
		Abs_123 msd =new Abs_123();
		msd.gargi();
		msd.john();
		msd.priya();
		msd.nandha();
		long yuvi = msd.yuvi();
		System.out.println(yuvi);
	}

}
