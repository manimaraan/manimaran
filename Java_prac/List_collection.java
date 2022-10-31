package Java_prac;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List_collection {
public static void main(String[] args) {
	List<Integer> a= new ArrayList<Integer>();
	List<Integer> b= new ArrayList<Integer>();
	List<Short>c= new LinkedList<Short>();
	List<Short>d=new Vector<Short>();
	a.add(450);        b.add(50);
	a.add(500);        b.add(75);
	a.add(550);        b.add(100);
	a.add(450);
	a.add(100);
    c.add((short)1000);  d.add((short)450);
    c.add((short)1500);  d.add((short)1500);
    c.add((short)2000);  d.add((short)950);
	
	
	System.out.println("a:"+a);
	System.out.println("b:"+b);
	System.out.println("c:"+c);
	System.out.println("d:"+d);
	
	
	System.out.println(a.size());
	System.out.println(b.size());
	System.out.println(c.size());
	System.out.println(d.size());
	
	
	System.out.println(a.get(1));
	System.out.println(b.get(2));
	System.out.println(c.get(1));
	System.out.println(d.get(0));
	
//	boolean retainAll = a.retainAll(b);
//	System.out.println(a);
//	boolean retainAll2 = c.retainAll(d);
//	System.out.println(c);
	
	
	
	
	
	
	

	Integer set = a.set(4, 250);
	System.out.println(a);
	Integer remove = a.remove(1);
	System.out.println(a);
	int indexOf = a.indexOf(250);
	System.out.println(indexOf);
	boolean contains = a.contains(450);
	System.out.println(contains);
	boolean addAll = a.addAll(b);
	System.out.println(a);
	for (int i = 0; i <a.size(); i++) {
		System.out.println(a.get(i));
		
	}
	boolean addAll2 = c.addAll(d);
	System.out.println(c);
	for (int j = 0; j <c.size(); j++) {
		System.out.println(c.get(j));
	}
		
	}
	
}

