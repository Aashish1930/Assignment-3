/*30. GIVEN A STRING 555-666-1234
DISPLAY AS 55-56-661-234?
*/

import java.util.Scanner;

public class program30 {
	public void check(String str)
	{
		String [] s=str.split("-");
			String s1=s[0];
			String s2=s[1];
			String s3=s[2];
			
			String D=s1+s2+s3;
			
			
			StringBuffer sb = new StringBuffer(D);
			sb.insert(2, "-");
			sb.insert(5, "-");
			sb.insert(9, "-");
			sb.insert(13, "-");
		
		str=sb.toString();
		System.out.println(str);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("enter here ");
		Scanner sc = new Scanner (System.in);
		String str=sc.nextLine();
		program30 p= new program30();
		p.check(str);
		
		
		
		
	}

}
