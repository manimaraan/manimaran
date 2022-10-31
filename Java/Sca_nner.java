package Java;

import java.util.Scanner;

public class Sca_nner {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("Welcome to State bank of india");
		System.out.println("Please insert the card");
		System.out.println("Enter the number for checking the card:");
		int n = ss.nextInt();
		if (n==1) {
			System.out.println("Your card is eligible");
		} else {
            System.out.println("Your card is not eligible");
		}
		System.out.println("Choose your language");
		int n2 = ss.nextInt();
		if (n2==1) {
			System.out.println("You choosen English");
		} else if (n2==2) {
			System.out.println("You choosen Tamil");
		} else {
			System.out.println("You choosen invalid language"); 
		}
		System.out.println("Withdraw cash/Check balance");
		int k = ss.nextInt();
		if (k==1) {
			System.out.println("Withdraw cash");
		}else if (k==2) {
			System.out.println("Check balance");
		}
		else {
			System.out.println("Pin change");
		}
	}

}
