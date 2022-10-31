package Java_prac;

public class Ammyy {
	static int i =1;
	private static void run() {
		if (i<=100) {
			System.out.println(i++);
		    run();

	}
}
public static void main(String[] args) {
	run();
}
}
