/*input1=commitment;
  output=cmmitmnt;
c be the first index position 
remove even vowels from the string
 */

package practice;

public class practice32 {

	public static void main(String[] args) {

		String str = "commitment";
		int count=1;
		for (char ch : str.toCharArray()){
			
			if(count %2==0 && (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u'))
			{
				count++;
			}
			else
			{
				System.out.print(ch);
				count++;
			}
			
		}
		
		
		
		
		
		
	}

}
