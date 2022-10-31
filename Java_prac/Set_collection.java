package Java_prac;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_collection {
public static void main(String[] args) {
	
	Set<Long> a= new HashSet<Long>();
	Set<Integer>b= new LinkedHashSet<Integer>();
	Set<Integer>c = new TreeSet<Integer>();
	a.add(200l);   b.add(75);    c.add(85);
	a.add(500l);   b.add(95);    c.add(225);
	a.add(550l);   b.add(99);    c.add(245);
	a.add(600l);
	a.add(200l);
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(a.size());
	boolean contains = c.contains(225);
	System.out.println(contains);
	boolean contains2 = a.contains(600);
	System.out.println(contains2);
	boolean addAll = b.addAll(c);
	System.out.println(b);
//	boolean retainAll = b.retainAll(c);
//	System.out.println(retainAll);
	for (Integer integer : b) {
		System.out.println(integer);
	}
}
}