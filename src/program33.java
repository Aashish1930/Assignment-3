
/*33. Retrieve the odd-position digits from input integer array. 
 * Multiply them with their index and return their sum.
*/



public class program33 {

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int sum = 0;
	

		for (int i = 0; i < array.length; i++) {
			if (i % 2 != 0) {
				System.out.println("Odd possition digit is " + array[i]);
				sum = sum + i * array[i];

			}

		}
		System.out.println("sum of odd digit with multiply index " + sum);

	}

}