import java.util.*;
public class Solution{
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		String[] Student= new String[3];
		int[] Rank= new int[3];
		for(int i=0;i<Student.length;i++) {
			Student[i]=sc.nextLine();
		}
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
		System.out.println("Highest Rank:"+Student[n]);
		System.out.println("Lowest Rank:"+Student[m]);
		
		
		
	}
}