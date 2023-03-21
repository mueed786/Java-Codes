import java.util.*;
import java.io.*;

class Loops2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
             int currentTerm = a;
            for (int j = 0; j < n; j++) {
                currentTerm += b * Math.pow(2, j);
                System.out.print(currentTerm + " ");
            }
            System.out.println();
        }
    }
}

