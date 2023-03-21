import java.io.Console;   
class Main3  
{   
    public static void main(String args[])    
    {   
        String str;   
  //Obtaining a reference to the console.   
        Console con = System.console();   
      // Checking If there is no console available, then exit.   
        if(con == null)    
        {   
            System.out.print("No console available");   
            return;   
        }   
//            
        // Read a string and then display it.   
        str = con.readLine("Enter your name: ");   
        con.printf("Here is your name: %s\n", str);   
   }   
}  

