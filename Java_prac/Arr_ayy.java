package Java_prac;

public class Arr_ayy {
	public static void main(String[] args) {
		int a[]= new int[5];
		String[]cc= {"Mani","Maran","Java","Developer"};
		a[0]=100;
	    a[1]=200;
	    a[2]=300;
	    a[3]=400;
	    System.out.println(a[0]);
	    for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	    System.out.println(cc[0]);
	    for (int j = 0; j < cc.length; j++) {
			System.out.println(cc[j]);
		}
	    String vv[][]=new String[2][2];
	    vv[0][0]="Mani";
	    vv[0][1]="Maran";
	    vv[1][0]="Java";
	    vv[1][1]="Developer";
	    for (int g = 0; g < vv.length; g++) {
	    	for (int h = 0; h < vv.length; h++) {
				System.out.print(vv[g][h]);
			}
	    	System.out.println(" ");
			
		}
	}

}
