package h2;

//import java.util.Arrays;

public class H2_main {

	public static void main(String[] args) {

		int n = 3287001;
		int digits = 0;
		int[] a = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		long divider;
		int index;
		double z;

		divider = 1;
		digits = 0;
		index = 8;

		while (n / divider > 0) {

			digits = digits + 1;
			divider = divider * 10;

		}

		divider = 10;

		while ((double) n / divider >= 0.1) {

			z = n % divider;

			if ((double) n / divider == 1) {

				z = 1;
				index = index - 1;
				a[index] = (int) z;
				break;

			} else if (z != (n % (divider / 10))) {

				while (z >= 10) {

					z = (int) z / 10;

				}
			} else {

				z = 0;

			}

			a[index] = (int) z;

			index = index - 1;

			divider = divider * 10;

		}

		//System.out.println("n hat " + digits + " Ziffern.");
		//System.out.println("Der Array a lautet: " + Arrays.toString(a));

	}

}
