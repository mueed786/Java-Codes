import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'typeCounter' function below.
     *
     * The function accepts STRING sentence as parameter.
     */

    public static void typeCounter(String sentence) {
        String[] x= sentence.split(" ");
        int in=0;
        int s=0;
        int d=0;
        int ifin;
        double ifdou;
        String stringOfStrings = sentence.replaceAll("[0-9.]","");
        stringOfStrings = stringOfStrings.replaceAll("  "," ");
        String[] value2 = stringOfStrings.split(" ");
        System.out.println("string " + value2.length);
        for(int i=0;i<x.length;i++){
            String count=x[i];
            try{
                ifin=Integer.parseInt(count);
                in+=1;
                continue;
                
            }
            catch(NumberFormatException e){
                
            }
            
        }
        System.out.println("integer"+" "+in);
        for(int i=0; i<x.length;i++){
            String count=x[i];
            try{
                ifdou=Double.parseDouble(count);
                if(count.contains(".")){
                    d+=1;
                    continue;
                }
            }
            catch(NumberFormatException e){
                
            }
        }
        System.out.print("double"+" "+d);
    }   

}

public class Strings3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String sentence = bufferedReader.readLine();

        Result.typeCounter(sentence);

        bufferedReader.close();
    }
}

