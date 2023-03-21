import java.util.*;
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String word =scan.nextLine();
		char[] c=word.toCharArray();
		
		
		int n=0;
		int d=c[0];
		
		
		for(int i=1;i<word.length();i++) {
			if(d==c[i]) {
				n++;
			}
			else {
				continue;
			}
			}
		if(n!=0) {
			System.out.println("-1");
		}
		else {
			System.out.println("0");
		}
		
	}
		

}

