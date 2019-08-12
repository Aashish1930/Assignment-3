/*35. Retrieve the elements in a array, which is an input,
 *  which are greater than a specific input number.
 *   Add them and find the reverse of the sum.
*/

import java.util.Scanner;

public class program35 {
	public void check(int[] numbers) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < numbers.length; i++) {

			System.out.println("enter the element ");
			numbers[i] = sc.nextInt();
		}
	}

	public void sum(int[] numbers) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		int sum = 0;
		int num = sc.nextInt();
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > num) {
				sum = sum + numbers[i];
			}
		}

		{
			System.out.println("sum of element is :- " + sum);
			String s = Integer.toString(sum);
			StringBuffer sb = new StringBuffer(s);
			sb.reverse();
			String s1 = sb.toString();
			System.out.println("sum is reverce order is:- " + s1);

		}

	}
	


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array ");
		int number = sc.nextInt();
		int numbers[] = new int[number];
		program35 p = new program35();
		p.check(numbers);
		p.sum(numbers);
	}

}
