
public class program40 {

	public static void main(String[] args) {
		String s="xyzwabcd";
		StringBuffer sb = new StringBuffer(s);
		//sb.reverse();
		System.out.println(sb);
		String s1=sb.toString();
		System.out.println("enter the value "+s1.substring(2,4));
		sb.deleteCharAt(2);
		sb.deleteCharAt(4);
		System.out.println(sb);
	
				
		
	}

}
