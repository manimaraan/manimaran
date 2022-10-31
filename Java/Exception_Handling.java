package Java;

public class Exception_Handling {
	public static void main(String[] args) {
		System.out.println("welcome");
		try {
			String s=null;
			char charAt = s.charAt(0);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("thankyou");
		}
		String g[]= {"java","python","selenium","framework"};
		for (int i = 0; i < g.length; i++) {
			System.out.println(i);
		}
		for (String string : g) {
			System.out.println(string);
		}
		try {
			System.out.println(50/0);
			try {
				String o=null;
				System.out.println(o.charAt(0));
			} catch (Exception e) {
				System.out.println("yeah yeah");
			}finally {
				System.out.println("print finally");
			}
		} catch (Exception e) {
			System.out.println("zero");
		}
	}

}
