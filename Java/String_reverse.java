package Java;

import java.util.Scanner;

public class String_reverse {
public static void main(String[] args) {
	Scanner ss = new Scanner(System.in);
	System.out.println("Enter the string:");
	String str = ss.nextLine();
	String rev="";
	String[] s2 = str.split(" ");
	for (int i =str.length()-1; i>=0; i--) {
		char c=str.charAt(i);
		rev=rev+c;
		
	}
	
	System.out.println(rev);
	
	}
 }
