public class Demo3 
{
	public static void main(String[] args) {
		System.out.println(1+2+"abcd");// 3abcd
		System.out.println("abcd"+1+2);//abcd12
		
		String[] name = new String[2];
		name[0]="raja";
		name[1]="ramu";
		System.out.println(name[0]);
		System.out.println(name[1]);
		name[1]="ramu kaka";
		System.out.println(name[0]);
		System.out.println(name[1]);
		
		
		int x=Integer.parseInt("123");
		System.out.println(x);
		
		Integer n = 123;
		String s=n.toString();
		System.out.println(s);
		
		
		
		
		
		
	}

}
