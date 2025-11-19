package h3;

//import java.util.Arrays;

public class H3_main {

	public static void main(String[] args) {

		int[][] einheiten = { { 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

		int input = 9997654;

		int index;

		index = 0;

		for (int i = einheiten[0][0]; input > 0; i = einheiten[0][index]) {

			while (input >= i) {

				input = input - i;

				einheiten[1][index] = einheiten[1][index] + 1;

			}

			if (index == 14) {

				break;

			}

			index = index + 1;

		}

		/*
		for (int[] zeile : einheiten) {
			System.out.println(Arrays.toString(zeile));
		}
		*/

	}

}
