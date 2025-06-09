package javaprogramme;

public class AllTypeMethod_9a 
{
	
	public static void Method1()
	{
		System.out.println("I am static Method");
	}
	
	public static void Method1(int a)
	{
		System.out.println("I am static Method");
		System.out.println(a);
	}
	
	public static void Method1(String b)
	{
		System.out.println("I am static Method");
		System.out.println(b);
	}
	
	public void Method2()
	{
		System.out.println("I am Non static Method");
	}
	
	public AllTypeMethod_9a()
	{
		System.out.println("This is Constructor");
	}
	
	public AllTypeMethod_9a(int x)
	{
		System.out.println("This is Constructor Overload");
		System.out.println(x);
	}
	
	public void Mouse()
	{
		System.out.println("Non static method 1");
	}
	
	public void Mouse(int x)
	{
		System.out.println("Non static method 2");
		System.out.println(x);
	}

	
	public static void main(String[] args)
	{
		
		AllTypeMethod_9a a9 = new AllTypeMethod_9a();
		
		Method1();
		Method1(9);
		a9.Method2();
		
		
		new AllTypeMethod_9a(5);
		a9.Mouse();
		a9.Mouse(2);
		
		
	}

}
