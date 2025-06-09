package javaprogramme;

class GrandParent
{
	
		void method1()
		{
			System.out.println("I am Grandparents Non Static Method");
			
		}

		static void method2()

		{
			
			System.out.println("I am Grandparents Static Method");
		}
}



class Parents1 extends GrandParent
{
	
	void method3()
	{
		System.out.println("I am Parents Non Static Method");
		
	}

	static void method4()

	{
		
		System.out.println("I am Parents Static Method");
	}



}



public class MultiLevelInheritance_15B extends Parents1
{
	

	
	void method5()
	{
		System.out.println("I am Child Non Static Method");
		
	}

	static void method6()

	{
		
		System.out.println("I am Child Static Method");
	}
	
	
	
	public static void main(String[] args) 
	{
	
		MultiLevelInheritance_15B mli = new MultiLevelInheritance_15B();
		mli.method1();
		method2();
		mli.method3();
		method4();
		mli.method5();
		method6();
		
		
	}

}
