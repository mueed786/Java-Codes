import java.util.*;
public class SymmetricPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int [][]arr=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int x=arr.length;
		for(int i=0;i<x;i++) {
			int a=arr[i][0];
			int b=arr[i][1];
			for(int j=i+1;j<x;j++) {
				int c=arr[j][0];
				int d=arr[j][1];
				if(a==d && b==c) {
					String s1=Integer.toString(a);
					String s2=Integer.toString(b);
					System.out.println("("+s1+","+s2+")");
				}
			}
		}

	}

}
