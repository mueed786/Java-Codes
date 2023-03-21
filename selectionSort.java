import java.util.*;
public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String number=sc.nextLine();
		String[] num=number.split(",");
		int[] arr=new int[num.length];
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(num[i]);
		}
		for(int i=0;i<arr.length;i++) {
			int min=arr[i];
			int temp;
			for(int j=0;j<arr.length;j++) {
				if(min<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
			 }
		 }
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

 }

