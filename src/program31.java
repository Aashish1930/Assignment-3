import java.util.Scanner;

/*31. input1="Rajasthan";
input2=2;
input3=5;
output=hts;
*/
public class program31 {
	public void check(StringBuffer sb){
		//System.out.println(sb);
		//sb.substring(2,5);
		String str1=sb.substring(2,5);
		System.out.println(str1);
	}
	public static void main(String[] args) {
		
		String str="RAJSTHAN";
		System.out.println(str);
		program31 p = new program31();
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		p.check(sb);
				
		
	}

}
