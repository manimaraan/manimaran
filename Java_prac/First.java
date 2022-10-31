package Java_prac;

public class First {
	private void Aari() {
		String aa = "manimaran";
		System.out.println(aa);

	}
	private void soori() {
		int i =88;
		int j =781;
		System.out.println(j-i);
		
	}
	private void paari() {
		char a ='M';
		byte b =-120;
		long k =45000;
		System.out.println((a)+" "+(k-b));
	}
	private void jacky() {
		boolean g =true;
		short s =4500;
		short d =5555;
		System.out.println((g)+" "+(s+d));

	}
	private void vicky() {
		int h =1200;
		if (h==1000) {
			System.out.println("done");
			
		}
	}
	public static void main(String[] args) {
		First jj = new First();
		jj.Aari();
		jj.soori();
		jj.paari();
		jj.jacky();
		jj.vicky();
	}

}
