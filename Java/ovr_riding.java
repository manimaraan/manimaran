package Java;

import java.util.Iterator;

public class ovr_riding  extends ovr_loading{
	@Override
	public void hari(boolean l) {
		int e=5;
	for (int i = 0; i < 5; i++) {
		System.out.println(i);
		
	}
		super.hari(l);
	}
	@Override
	public void hari(char p) {
		long g=5000;
		byte v=126;
		if (g>1000 && v<1000) {
			System.out.println("condition 1");
			
		} else {
            System.out.println("condition 2");
		}
		super.hari(p);
	}
	@Override
	public void hari(int a, int b, int c) {
		System.out.println("suba");
		super.hari(a, b, c);
	}
	@Override
	public void hari(String s, String v, String h) {
		System.out.println("karaikudi");
		super.hari(s, v, h);
	}
	private void mano() {
		String[]qq= {"greens","tech"};
		System.out.println(qq);
	}
	
	public static void main(String[] args) {
		ovr_riding nh =new ovr_riding();
		nh.hari(false);
		nh.hari('j');
		nh.hari(4, 5, 8);
		nh.hari("mn", "jk", "kl");
		nh.mano();
	}
	

}
