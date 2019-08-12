import java.util.Scanner;

/*24. validate a password 
i) there should be atleast one digit
ii) there should be atleast one of '#','@' or '$' .
iii)the password should be of 6 to 20 characters
iv) there should be more uppercase letter than lower case.
v) should start with an upper case and end with lower 
case(//https://stackoverflow.com/questions/43326576/program-for-password-validation)
*/




public class Program24 {
public void check(String str)
{
	String regex="^[A-Z](?=.*[0-9])(?=.*[a-zA-Z])(?=.*[@#$]).{6,20}[a-z]$";
	
	
		if(str.matches(regex))
		{
			
			System.out.println("validate the password ");
		}
		else{
		
			System.out.println("plese enter the valid password ");
		}
}
	
public static void main(String[] args) {
		System.out.println("Enter the password here ");
		Scanner sc=new Scanner(System.in);
		String str= sc.nextLine();
		Program24 p = new Program24();
		p.check(str);
	
	
	}
	
}


