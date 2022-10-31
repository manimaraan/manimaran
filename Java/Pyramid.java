package Java;



public class Pyramid {
public static void main(String[] args) {
	
//	for (int i = 1; i <=5; i++) {
//		for (int j = 1; j <i+1; j++) {
//			System.out.print("*");
//		}
//		System.out.println(" ");
//	}
//}
//}
























//	String s="White ball black ball white";
//	System.out.println(s);
//	String s1=s.toLowerCase();
//	System.out.println(s1);
//	String[] split = s1.split(" ");
//	for (String string : split) {
//		System.out.println(string);
//	}
//	int count;
//	for (int i = 0; i <= split.length; i++) {
//		count=1;
//		for (int j =i+1; j <= split.length-1; j++) {
//			if (split[i].equals(split[j])) {
//				count++;
//				split[j]="0";
//			}
//		}
//		if (count>1&&split[i]!="0") {
//			System.out.println(split[i]+":"+count);
//			
//		}
//	}
	int a[]=new int[5];
	a[0]=100;
	a[1]=200;
	a[2]=300;
	a[3]=400;
	a[4]=500;
	System.out.println(a[0]);
	for (int i = 0; i <= a.length; i++) {
		for (int j = i+1; j > a.length-1; j--) {
			System.out.print(a[j]);	
			}
		System.out.println();
	}
	
	
	}
}

