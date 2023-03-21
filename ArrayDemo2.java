import java.util.*;

public class ArrayDemo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int count2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            } else {
                count2++;
            }
        }

        int[] arr1 = new int[count];
        int[] arr2 = new int[count2];

        int j = 0, k = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arr1[j++] = arr[i];
            } else {
                arr2[k++] = arr[i];
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
		
	}
   }
}

