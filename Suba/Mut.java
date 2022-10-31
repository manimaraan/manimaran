package Suba;

public class Mut {
	public static void main(String[] args) {
		StringBuffer aa = new StringBuffer("Mani");
		StringBuffer bb = new StringBuffer("Maran");
		System.out.println(System.identityHashCode(aa));
		System.out.println(System.identityHashCode(bb));
		StringBuffer append = aa.append(bb);
		System.out.println(append);
		System.out.println(System.identityHashCode(append));
		StringBuilder cc = new StringBuilder("virat");
		StringBuilder dd = new StringBuilder("kohli");
		StringBuilder append2 = cc.append(dd);
		System.out.println(append2);
		StringBuffer append3 = append.append(append2);
		System.out.println(append3);
	}

}
