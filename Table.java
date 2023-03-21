import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("Enter Table:");
		int n= s.nextInt();
		System.out.println("Enter last digit:");
		int d = s.nextInt();
		
		int i=0;
		while(i<=d) {
			
			System.out.println(n+" "+"*"+" "+i+"="+" "+(n*i));
			i++;
		}
	}

}
