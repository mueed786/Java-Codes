import java.util.Scanner;

public class Main2 {

	public static void searchString(String arr[], String data) {
		boolean found= false;
		for(int i=0;i<arr.length;i++){
			if(arr[i].equals(data)){
				found=true;
				break;
			}
		}
		if(found==true) {
			System.out.println(data+" "+"found");
		}
		else {
			System.out.println(data+" "+"Not found");
		}
			
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String array[] = new String[num];
		for (int i = 0; i < num; i++) {
			array[i] = sc.nextLine();
		}
		String data = sc.nextLine();
		searchString(array, data);
	}
}
