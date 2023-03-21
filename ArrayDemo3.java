import java.util.*;
public class ArrayDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}	
		int sum1=0;
		int sum2=0;
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				sum1=sum1+arr[i];
			}
			else {
				sum2=sum2+arr[i];
			}
		}
		int x=(sum1-(sum2))*(sum1-(sum2));
		System.out.println(x);
		
		
		

	}

}