import java.util.*;
public class MatrixSums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int s=0;
		int arr[][]=new int[n][m];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		//Sum of rows
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				s+=arr[i][j];
			}
			System.out.println("Sum of "+i+"row = "+s);
			s=0;
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				s+=arr[j][i];
			}
			System.out.println("Sum of "+i+"colomn = "+s);
			s=0;
		}
		

	}

}
