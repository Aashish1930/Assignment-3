
/*
 * input1=commitment;
  output=cmmitmnt;
c be the first index position 
remove even vowels from the string
 */
import java.util.Scanner;

public class program32{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String input = sc.next();

		int count = 1;

		for (char ch : input.toCharArray()) {
			if (count % 2 == 0 && (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) 
{

			} else
				System.out.print(ch);
			count++;

		}
		
	}
}
