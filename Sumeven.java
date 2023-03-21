import java.util.*;
class Sumeven {
	int low;
	int high;
    public int countOdds(int low, int high) {
    	
        int s=0;
        for(int i=low;i<=high;i++){
            if(i%2!=0){
                s+=1;
            }
            else{
                continue;
            }
        }
        return s;
    }
    public static void main(String[] args){
        Sumeven sl=new Sumeven();
        Scanner sc=new Scanner(System.in);
        sl.low=sc.nextInt();
         sl.high=sc.nextInt();
        System.out.println(sl.countOdds(sl.low,sl.high));
    }
}