
/*22. Enter yout name and return a string 
"print the title first and then comma and then first"
+ " letter of initial name.
*/

import java.util.Scanner;

public class program22 {
	public void check(String str) {

		String[] s2 = str.split("[.]");

		System.out.print(s2[0] + ",");

		String[] s1 = str.split(" ");

		System.out.print(" " + s1[1].charAt(0));
		System.out.print(" " + s1[2].charAt(0));
		System.out.print(" " + s1[s1.length-1]);
	}

	public static void main(String[] args) {

		System.out.println("Enter Full Name Here ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		program22 p = new program22();
		p.check(str);

	}

}
