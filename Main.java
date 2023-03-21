import java.util.*;
public class Main {

    public static int[] sumOfArray(int arr1[],int arr2[])
	{
	      //write your answer here
		  int sum[]=new int[arr1.length];
		  for(int i=0;i<sum.length;i++){
			  sum[i]=arr1[i]+arr2[i];
		  }
		  return sum;
	
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr1[] = new int[num];
		int arr2[] = new int[num];
		
		
		for (int i = 0; i < num; i++) {
			arr1[i] = sc.nextInt();
		}
		for (int i = 0; i < num; i++) {
			arr2[i] = sc.nextInt();
		}
		int arr3[] = sumOfArray(arr1,arr2);
		for (int i = 0; i < num; i++) {
			System.out.println(arr3[i]);
		}
	}
}
