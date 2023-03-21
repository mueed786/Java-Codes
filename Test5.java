import java.util.*;

class Students{
	int id;
	String name;
	
}
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Scanner sz=new Scanner(System.in);
		Students s=new Students();
		int id;
		int name;
		System.out.println("Enter id:");
		s.id=sc.nextInt();
		System.out.println("Enter name: ");
		s.name=sz.nextLine();
		System.out.println("Student ID: "+s.id);
		System.out.println("Student name "+s.name);

	}

}
