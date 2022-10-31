package Java;

import java.util.LinkedHashMap;
import java.util.Map;


public class Repetative_words {
public static void main(String[] args) {
//	String a ="mani maran mani likes cricket so much";
//	System.out.println(a.length());
//	String[] split = a.split(" ");
//	Map<String,Integer> bb =new LinkedHashMap<String,Integer>();
//	for (int i = 0; i < split.length; i++) {
//		if (bb.containsKey(split[i])) {
//			Integer integer = bb.get(split[i]);
//			bb.put( split[i],integer+1);
//		}
//		else {
//			bb.put( split[i],1 );
//		}
//	
//}
//	System.out.println(bb);
	
	
	
	
	
//	String a="mani likes cinema so much than mani maran";
//	System.out.println(a.length());
//	String[] split = a.split(" ");
//	Map<String, Integer> kk =new LinkedHashMap<String,Integer>();
//	for (int i = 0; i < split.length; i++) {
//		if (kk.containsKey(split[i])) {
//			Integer integer = kk.get(split[i]);
//			kk.put(split[i], integer+1);
//		}
//		else {
//			kk.put(split[i], 1);
//		}
//	}
//	System.out.println(kk);
	
	String s="Mani maran likes cricket so much than mani maran";
	System.out.println(s.length());
	String[] split = s.split(" ");
	Map<String, Integer> kk = new LinkedHashMap<String,Integer>();
	for (int i = 0; i < split.length; i++) {
		if (kk.containsKey(split[i])) {
			Integer integer = kk.get(split[i]);
			kk.put(split[i], integer+1);
		}
		else {
			kk.put(split[i], 1);
		}
	}
	
	System.out.println(kk);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}