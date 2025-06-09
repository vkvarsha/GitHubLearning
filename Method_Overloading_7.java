package javaprogramme;

public class Method_Overloading_7
{

	static void add()
	{
		System.out.println("Method 1");
	}
	
	static void add(int x)
	{
		System.out.println("Method 2");
	}
	
	static void add(int x,int y)
	{
		System.out.println("Method 3");
	}
	
	static void add(int x,int y,int z)
	{
		System.out.println("Method 4");
	}
	
	static void add(int x,String y)
	{
		System.out.println("Method 5");
	}
	
	static void add(int x,char c,String w)
	{
		System.out.println("Method 6");
	}
	
	static void add(int x,String w,char c)
	{
		System.out.println("Method 7");
	}
	
	static void add(long x,String w,char c)
	{
		System.out.println("Method 8");
	}
	public static void main(String[] args) 
	{
		// Developing multiple methods with the same name but variation with the argument list 
		//is called as Method overloading
		
		/* What do you mean by Variation in argument list 
		 * 1.No of Argument
		 * 2.Order of ocurance of the argument
		 * 3.Type of argument
		 * 
		 * 
		 * 
		 * Note :- We can overload both static as well as Non Static Method*/
		
		add();
		add(1,3);
		add(1,5,3);
		add(4,"hello",'c');
		
	}

}
