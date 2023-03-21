import java.util.*;
class StudentRank{
	String[] students;
	int[] n;
	StudentRank(String[] students, int[]n){
		this.students=students;
		this.n=n;
	}
	int highestRank() {
		int max=n[0];
		for(int i=1;i<n.length;i++) {
			if(max<n[i]) {
				max=n[i];
			}
			else {
				continue;
			}
		}
		if(max<0) {
			return 0;
		}
		else {
			return max;
		}
	}
	//min
	//max
	public int lowestRank() {
		int min=n[0];
		for(int i=1;i<n.length;i++) {
			if(min>n[i]) {
				min=n[i];
			}
			else {
				continue;
			}
		}
		if(min<0) {
			return 0;
		}
		else {
			return min;
		}
		
	}
	
}
public class Assement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//int num =sc.nextInt();
		String s1= sc.nextLine();
		//int[] n =new int[num];
		String student = sc.nextLine();
		String[] students= student.split(",");
		String[] lett=s1.split(",");
		int n[]=new int[lett.length];
		for(int i=0;i<lett.length;i++) {
			n[i]=Integer.parseInt(lett[i]);
		}
		StudentRank st=new StudentRank(students, n);
		System.out.println(st.highestRank()+" "+st.lowestRank());
		//for(int i=0;i<students.length;i++) {
			//System.out.print(students[i]+" ");
		//}
		
		
		
		
	}

}
