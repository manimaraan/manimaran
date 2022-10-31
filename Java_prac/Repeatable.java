package Java_prac;

public class Repeatable {
public static void main(String[] args) {
//	String s="Black ball ball white";
//	System.out.println(s);
//	String s1;
//	s1=s.toLowerCase();
//	System.out.println(s1);
//	String[] split = s1.split(" ");
//	for (String sp : split) {
//		System.out.println(sp);
//	}
//	int count;
//	for (int i = 0; i <= split.length; i++) {
//		count=1;
//		for (int j = i+1; j <=split.length-1; j++) {
//			if (split[i].equals(split[j])) {
//				count++;
//				split[j]="0";
//			}
//			
//		}
//		if (count>1 && split[i]!="0") {
//		System.out.println(split[i]+":"+count);
//			
//		}
//	}
	
	String s="Black ball White Ball";
	System.out.println(s);
	String s1;
	s1=s.toLowerCase();
	System.out.println(s1);
	String[] split = s1.split(" ");
	for (String string : split) {
		System.out.println(string);
	}
	int count;
	for (int i = 0; i <= split.length; i++) {
		count=1;
		for (int j = i+1; j <= split.length-1; j++) {
			if (split[i].equals(split[j])) {
				count++;
				split[j]="0";
				
			}
		}
		if (count>1 && split[i]!="0") {
			System.out.println(split[i]+":"+count);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
