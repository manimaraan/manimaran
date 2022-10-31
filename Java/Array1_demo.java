package Java;

public class Array1_demo {
	public static void main(String[] args) {
		
		short abc[]=new short[10];
		
		String kl []={"chennai","madurai","trichy","coimbatore"};
		abc[0]=5000;
		abc[1]=5500;
		abc[2]=6000;
		abc[3]=6500;
		abc[4]=7000;
		abc[5]=7500;
		abc[6]=8000;
		abc[7]=8500;
		abc[8]=9000;
		abc[9]=9500;
		
		System.out.println(abc[9]);
		for (int i = 0; i < abc.length; i++) {
			System.out.println(abc[i]);
		}
		for (int j = 0; j < kl.length; j++) {
			System.out.println(kl[j]);
		}
		
		String vk[][]=new String [2][3];
		vk[0][0]="avadi";
		vk[0][1]="ambattur";
		vk[0][2]="anna nagar";
		vk[1][0]="cmbt";
		vk[1][1]="lucas";
		vk[1][2]="vavin";
		System.out.println(vk[1][2]);
		for (int l = 0; l < 2; l++) {
			for (int k = 0; k < 3; k++) {
				System.out.print(vk[l][k]);
			}
			System.out.println(" ");
		}
	}

}
