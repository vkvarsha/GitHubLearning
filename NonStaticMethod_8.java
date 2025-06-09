package javaprogramme;

public class NonStaticMethod_8 
{
	int age = 50;
	static int world = 30;
	static void add()
	{
		System.out.println("This is Static Method");
		System.out.println(world);
	}
	
	void add2()
	{
		System.out.println("This is Non static method");
	}
	
	void add2(int x)
	{
		System.out.println("This is non static and method overloading");
		System.out.println("Here is the value of" + x);
	}

	public static void main(String[] args) 
	{
	
		//Any Non static method, in order to call inside the main method, we need to call with object
		//you can directly call non static method
		
		/*  Syntax of creating an object
		 * 
		 * ClassName reference_variable = new ClassName();
		 * 
		 *  
		 *  
		 *  */
		
		add();
		NonStaticMethod_8 n8 = new NonStaticMethod_8();
		n8.add2();
		n8.add();
		n8.add2(5);
		
		
	}

}
