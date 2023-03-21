import java.util.*;
public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}	
		int max=arr[0];
		int min=arr[0];
	for(int i=1;i<arr.length;i++) {
			
			if(max>arr[i]) {
				max=arr[i];
			}
		}
	for(int i=1;i<arr.length;i++) {
		
		if(min>arr[i]) {
			min=arr[i];
		}
	}
		System.out.println(max);
		System.out.println(min);
		int x=(max-(min))*(max-(min));
		System.out.println(x);
		
		
		

	}

}
