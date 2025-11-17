package h2;

//import java.util.Arrays;

public class H2_main {

	public static void main(String[] args) {

		int n = 100099;
		int digits = 0;
		int[] a = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		int divider;
		long divider_2;
		int index;
		double z;

		divider = 1;
		divider_2 = 10;
		digits = 0;
		index = 8;

		while (n / divider > 0) {

			digits = digits + 1;
			divider = divider * 10;

		}

		while ((double) n / divider_2 >= 0.1) {

			z = n % divider_2;

			if ((double) n / divider_2 == 1) {
				
				z = 1;
				index = index - 1;
				a[index] = (int) z;
				break;
				
			}
			else if (z != (n % (divider_2 / 10))) {

				while (z >= 10) {

					z = (int) z / 10;
					
				}
			} 
			else {

				z = 0;

			}

			a[index] = (int) z;

			index = index - 1;

			divider_2 = divider_2 * 10;

		}

		//System.out.println("n hat " + digits + " Ziffern.");
		//System.out.println("Der Array a lautet: " + Arrays.toString(a));

	}

}
