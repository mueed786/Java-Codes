import java.util.*;
import java.io.*;
import java.lang.*;
public class Pattern {
	public static void main(String[]args)throws IOException {
		Scanner sc=new Scanner(System.in);
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		//int n=Integer.parseInt(bf.readLine());
		String word=bf.readLine();
		String[] words=word.split(",");
		int [] sum=new int[words.length];
		for(int i=0;i<words.length;i++) {
			sum[i]=Integer.parseInt(words[i]);
		}
		for(int i=0;i<sum.length;i++) {
			System.out.print(sum[i]+",");		
		}
		
		//String[] str= new String[n];
		//for(int i=0;i<str.length;i++) {
			//str[i]=sc.nextLine();
		//}
		
		
		//int n=sc.nextInt();
		//int m=sc.nextInt();
		//for(int i=0;i<n;i++) {
			//for(int j=0;j<m;j++) {
				//System.out.print("*"+" ");
			//}
			//System.out.println();
		}
		
	}

