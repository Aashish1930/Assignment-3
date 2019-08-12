/*(37). compare two strings, if the characters in string 1 are present in
   string 2, then it should be put as such in output, else '+' should be
   put in output...ignore case difference.

	input 1:"New York"
	input 2:"NWYR"

	output:N+w+Y+r+
*/

import java.util.Scanner;

public class program37 {
	public void compare(String s1, String s2) {
		char[] ch1 = s1.toUpperCase().toCharArray();
		char[] ch2 = s2.toUpperCase().toCharArray();
		for (int i = 0; i < ch1.length; i++) {
			for (int j = 0; j < ch2.length; j++)
				if (ch1[i] == ch2[j]) {
					System.out.print(ch1[i] + "+");
				}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String 1st ");
		String s1 = sc.nextLine();
		System.out.println("enter String 2nd ");
		String s2 = sc.nextLine();
		program37 p = new program37();
		p.compare(s1, s2);
	}

}
