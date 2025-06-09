package javaprogramme;

class Parent
{
	
	static void method1()
	{
		
		System.out.println("I am Parent Class Method 1");
	}
	
	static void method2()
	{
		
		System.out.println("I am Parent Class Method 2");
	}

	void mehtod5()
	{
		
		System.out.println("I am Parents Non static method");
	}
}

public class SingleLevelInheritance_15A extends Parent
{
	
	/*  Single Level Inheritance
   *  Inheriting property from one class to another class is called SIngle level inheritance
   *   
	 *  */
	static void method3()
	{
		
		System.out.println("I am Child Class Method 1");
	}
	
	static void method4()
	{
		
		System.out.println("I am Child Class Method 2");
	}

	
	void method6()

	{
		
		System.out.println("I am Child class Non static method");
	}
	
	
	public static void main(String[] args) 
	{
		method3();
		method4();
		method1();
		method2();
		
		SingleLevelInheritance_15A ch = new SingleLevelInheritance_15A()
;
		ch.mehtod5();
		ch.method6();
		
	}

}
