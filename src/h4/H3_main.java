package h4;

public class H3_main {
	
	public static void main (String[] args) {
		
		int n = 99123;
		
		double z;
		
		z = (int) n / 10;
		
		while (z >= 10) {

			z = (int) z / 10;
		System.out.println(z);
		}
		
	}

}
