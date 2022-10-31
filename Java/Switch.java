package Java;
import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
		Scanner zz=new Scanner(System.in);
		
		for (int i = 0; i <6; i++) {
			int nextInt = zz.nextInt();
			switch (nextInt) {
			case 1:
				long a=15252;
				if (a>450 && a<55555) {
					System.out.println(a);
				}
				break;

			
            case 2:
            	int q=5;
            	byte j=1;
            	while (q>=1 || j<=0) {
            		System.out.println(q+"  "+j);
					q--;
					j--;
				}
				break;
           case 3:
        	   
        	   for (int k = 0;k<5; k++) {
        		   System.out.println(k);	
			}		
				break;	
           case 4:
				String e="AJITH";
				String l="GOWTHAM";
				System.out.println(e+"  "+l);
				break;			
           case 5:
        	   boolean h=true;
        	   System.out.println(h);
				
				break;	
			default:
				System.out.println("switch case statement");
				break;
			}
		
		}
	}
	

}
