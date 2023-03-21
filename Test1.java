
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number[]={2,7,3,5,8,9};

		   int find=number[0];

		  for(int i=0; i < number.length; i++){

		    if(number[i] > find){

		        find=number[i];

		      }

		  } 

		  System.out.print(find);
	}
}
