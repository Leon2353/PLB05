package h1;

//import java.util.Arrays;

public class H1_main {

	public static void main(String[] args) {

		int[] myArray = { 2, 12423, 23123, 22, 11, 32489723, 33, 0, 0 };
		
		int[] newArray = new int[myArray.length];
		
		int index;


		index = 0;

		while (myArray.length > index) {

			newArray[index] = myArray[myArray.length - (index +1)];
			
			index = index + 1;

		}
		
		myArray = newArray;
		
		//System.out.println(Arrays.toString(myArray));
		
	}

}
