package Suba;

public class Repeattt {
	public static void main(String[] args) {
		String s="Mani called Mani Maran";
		System.out.println(s);
	String	s1=s.toUpperCase();
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
			if (count>1&&split[i]!="0") {
				System.out.println(split[i]+":"+count);
			}
		}
	}

}
