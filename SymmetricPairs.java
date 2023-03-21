import java.util.*;

public class SymmetricPairs {
    
    public static void main(String[] args) {
        int[][] arr = {{11, 20}, {30, 40}, {5, 10}, {40, 30}, {10, 5}};
        List<int[]> symmetricPairs = findSymmetricPairs(arr);
        System.out.println("Following pairs have symmetric pairs:");
        for(int[] pair : symmetricPairs) {
            System.out.println(Arrays.toString(pair));
        }
        System.out.println(arr.length);
    }
    
    public static List<int[]> findSymmetricPairs(int[][] arr) {
        int n = arr.length;
        List<int[]> symmetricPairs = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int a = arr[i][0];
            int b = arr[i][1];
            for(int j = i+1; j < n; j++) {
                int c = arr[j][0];
                int d = arr[j][1];
                if(a == d && b == c) {
                    symmetricPairs.add(new int[] {a, b});
                    //symmetricPairs.add(new int[] {c, d});
                }
            }
        }
        return symmetricPairs;
    }
}