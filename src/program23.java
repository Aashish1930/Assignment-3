

/*23. Write a Program that accepts a string and removes
 *  the duplicate characters.
 */




import java.util.ArrayList;
import java.util.Scanner;

public class program23 {

	public static void main(String[] args) {
		
		ArrayList a1= new ArrayList();
		StringBuffer sb= new StringBuffer();
		Scanner in =new Scanner(System.in);
		
		System.out.println("enter string");
		String s = in.nextLine();
	//	a1.add(s);
		for(int i=0;i<s.length();i++)
			
		{
			char ch=s.charAt(i); //pass the single character of string in ch
			if(!a1.contains(ch)) // if single character of string is not presennt in list a1
			{
				a1.add(ch);       // add the single character of the string
				sb.append(ch);	   // single character of the string 
			}
			
			
		}
		s=sb.toString(); // pass the object of = 
		System.out.println(s);
		
	}

}
