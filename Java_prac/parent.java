package Java_prac;

import java.util.Iterator;

public class parent {

	private void mani() {
		int i =10;
		for ( i = 0; i <=15; i++) {
			if (i<16) {
				System.out.println("yeahhhh");
				
			}else {
				System.out.println("nooooooo");
			}
		}

	}
	private void john() {
		short s =450;
		String d="SELENIUM";
		try {
		if (450>100 == 450>449) {
			System.out.println(d);
		} else if (450<500 || 450>445) {
			System.out.println(s);
		} else {
			System.out.println("hiiiiiiiiiiiiiiiii");
		}

		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	private void naren() {
		// TODO Auto-generated method stub

	}
	private void jothi() {
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		parent hh = new parent();
		hh.mani();
		hh.john();
		
	}
}
