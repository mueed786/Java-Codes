public class Demo2
{
	public static void main(String[] args) 
	{
		String name= "raja ram mohan roy";
		
		
		
		System.out.println(name.charAt(0));
		System.out.println(name.concat(" "));
		char[] charArr=name.toCharArray();
		
		String [] nameParts=name.split(" ");
		for(String part:nameParts)
		{
			 System.out.println(part);
		}
		
		System.out.println(name.substring(9));
		System.out.println(name.substring(9,14));
		
		System.out.println(name);
		System.out.println(name.trim());
		//System.out.println(name.stripLeading());
		//System.out.println(name.stripTrailing());
		
		System.out.println(name.equals("saqib"));
		System.out.println(name.equalsIgnoreCase("Raja Ram Mohan Roy"));
		
		System.out.println("Syed".compareTo("Syed"));
		//res= +ve current string is bigger than given string
		// res= -ve current string is smaller than given string
		// res = 0 both are equal
		
		
		
		
		
	}

}
