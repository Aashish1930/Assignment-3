import java.util.Scanner;

/*25. find the average of the maximum and minimum number in an
 *  integer array
*/ 


public class program25 {


	public static void main(String[] args) {
		
		int array[] = { 11, 20, 31, 4, 5, 60 };

		int min=array[0];
		 for(int i=0;i<array.length;i++)
		 {
			 if(array[i]<min)
			 {
				 min=array[i];
			 }
		 }
			 System.out.println("minimum avarage "+min);
	
		 int max=array[0];
		 for(int j=0;j<array.length;j++)
		 {
			 if(array[j]>max)
			 {
				 max=array[j];
				 
			 }
		 }System.out.println("maximum avarage is "+max);
		
		 int avarage = (min+max)/2;
		 System.out.println("avarage is "+avarage);
	
	}

}
