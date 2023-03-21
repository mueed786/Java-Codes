public class LoopDemo 
{
	public static void main(String[] args) 
	{

		for(int j =0;j<=4;j++)
		{
			for(int i=0;i<=j;i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		int a=0;
//		while(m1())
	//	{
		//	System.out.print("*");
			//a++;
		//}
		
		
		do {
			System.out.println("*");
			a++;
		}while(a<=4);
		
		String[] names= {"abcd","efgh","ijkl","lmno","pqrs"};
//		
//		for(String name:names)
//		{
//			System.out.println(name);
//		}
		
		for(int i =names.length-1; i>=0;i--)
		{
			System.out.println(names[i]);
		}
		
		//System.out.println(10/0);
		
		
		
		
		
		
		
		
		
		
		
	}
	static boolean m1()
	{return true;}

}
