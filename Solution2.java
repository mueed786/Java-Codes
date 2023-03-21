import java.util.Scanner;
public class Solution2{
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		String Student;
		int[] Rank= new int[3];
		
			Student=sc.nextLine();
			String[] Students=Student.split(",");
		
		for(int j=0;j<Rank.length;j++) {
			Rank[j]=sc.nextInt();
		}
		int n=0;
		int max=Rank[0];
		for(int i=0;i<Rank.length;i++) {
			if(max<Rank[i]) {
				max=Rank[i];
				n=i;
			}
			else {
				continue;
			}
		}
		int m=0;
		int min=Rank[0];
		for(int j=0;j<Rank.length;j++) {
			if(min>Rank[j]) {
				min=Rank[j];
				m=j;
			}
			else {
				continue;
			}
		}
		System.out.println(Students[n]+","+Students[m]);
		System.out.println();
		
		
	}
}