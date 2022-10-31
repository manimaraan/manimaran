package Java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class java_practice {
	private void balu() {
		String s="mohan is a student";
		System.out.println(s);
	}
    private void loki() {
		int i =555;
		int j=666;
		System.out.println(i*j);

	}
    private void nelsa() {
		char a='M';
		boolean b=true;
		System.out.println(a);
		System.out.println(b);

	}
    private void ani() {
		byte w=-126;
		System.out.println(w);

	}
    public static void main(String[] args) {
		java_practice abc = new java_practice();
		abc.balu();
		abc.ani();
		abc.loki();
		abc.nelsa();
		List<Integer> ll = new ArrayList<Integer>();
		List<Integer> ss = new LinkedList<Integer>();
		ll.add(444);   ss.add(501);
		ll.add(454);   ss.add(555);
		ll.add(474);   ss.add(777);
		ll.add(555);
		System.out.println(ll);
		System.out.println(ss);
		ll.retainAll(ss);
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.get(3));
		System.out.println(ll.set(0,400));
	//	System.out.println(ll.remove(2));
		System.out.println(ll.indexOf(555));
		System.out.println(ll.contains(435));
	//	ll.clear();
		ll.addAll(ss);
		System.out.println(ll);
		
	}
}
