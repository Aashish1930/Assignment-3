import java.util.Scanner;

/*find the three consecutive characters in a string.
 *  if the string consists any three 
   consecutive characters return 1 else return -1
   like AAAxyzaaa will return true.
*/
public class ConsecutiveCharString {

	int cnt;
	boolean return1;
	String str;

	ConsecutiveCharString(String str) {
		this.str = str;

	}

	public boolean show(char c)

	{
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == c) {
				cnt = cnt + 1;

				if (cnt == 2) {

					return1 = true;
				}

			}
		}

		cnt = 0;
		return return1;

	}

	public static void main(String[] args) throws Exception {

		System.out.println("Enter the String ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		ConsecutiveCharString c1 = new ConsecutiveCharString(s);
		for (int i = 0; i < s.length(); i++) {
			boolean c = c1.show(s.charAt(i));
			if (c == true) {
				System.out.println(1);
			}
			System.out.println(-1);
		}

	}

}
