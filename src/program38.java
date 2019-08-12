import java.util.Scanner;

/*
 *  input:
	Searchstring s1="GeniusRajkumarDev";
	String s2="Raj";
	String s3="Dev";
   output:  Return 1 if s2 comes before s3 in searchstring else return 2
 */

public class program38 {

	public int campare() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the main string ");
		String s1 = sc.nextLine();
		System.out.println("enter the 1st string ");
		String s2 = sc.nextLine();
		System.out.println("enter the 2nd String ");
		String s3 = sc.nextLine();

		if (s1.contains(s2) && s1.contains(s3)) {
			if (s1.indexOf(s2) < s1.indexOf(s3)) {
				return 1;
			}
		}
		return 2;
	}

	public static void main(String[] args) {

		program38 p = new program38();
		System.out.println(p.campare());
	}

}
