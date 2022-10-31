package Java;

public class String_fun {
public static void main(String[] args) {
	String a ="mani maran Mani";
	String b="mani maran Mani";
	int length = a.length();
	System.out.println(length);
	int l2 = b.length();
	System.out.println(l2);
	boolean equals = a.equals(b);
	System.out.println(equals);
	boolean equalsIgnoreCase = a.equalsIgnoreCase(b);
	System.out.println(equalsIgnoreCase);
	String upperCase = a.toUpperCase();
	System.out.println(upperCase);
	System.out.println(b.toLowerCase());
	boolean startsWith = a.startsWith("m");
	System.out.println(startsWith);
	boolean endsWith = b.endsWith("I");
	System.out.println(endsWith);
	boolean contains = a.contains("M");
	System.out.println(contains);
	int indexOf = b.indexOf("M");
	System.out.println(indexOf);
	int indexOf2 = a.indexOf("i");
	System.out.println(indexOf2);
	int lastIndexOf = a.lastIndexOf("r");
	System.out.println(lastIndexOf);
	int lastIndexOf2 = b.lastIndexOf("M");
	System.out.println(lastIndexOf2);
	char charAt = a.charAt(13);
	System.out.println(charAt);
	String replace = b.replace("maran","kumar");
	System.out.println(replace);
	String replace2 = a.replace("maran", "cricket");
	System.out.println(replace2);
	String substring = a.substring(8);
	System.out.println(substring);
	boolean empty = b.isEmpty();
	System.out.println(empty);
	String concat = a.concat(b);
	System.out.println(concat);
	String[] split = a.split(" ");
	for (int i = 0; i < split.length; i++) {
		System.out.println(split[i]);
	}
	String trim = b.trim();
	System.out.println(trim);
}
}
