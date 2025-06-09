package javaprogramme;



abstract class One
{
	
	abstract void M1();
	static void M2()
	{
		System.out.println("M2");
	}
	
	void M3()
	{
		System.out.println("M3");
	}

}

abstract class TwO extends One
{
	
	abstract void M6();
	static void M4()
	{
		System.out.println("M4");
	}
	
	void M5()
	{
		System.out.println("M5");
	}

}


public class Abstract_Example2_17F  extends TwO
{

	
	static void M7()
	{
		System.out.println("M7");
	}
	
	void M8()
	{
		System.out.println("M8");
	}

	public static void main(String[] args)
	{
		Abstract_Example2_17F AEF = new Abstract_Example2_17F();
		AEF.M1();
		AEF.M2();
		AEF.M3();
		AEF.M4();
		AEF.M5();
		AEF.M6();
		AEF.M7();
		AEF.M8();
		
				
	}

	@Override
	void M6() 
	{
	
		System.out.println("Overrided M6");
		
	}

	@Override
	void M1() {
		System.out.println("Overrided M1");
		
	}

}
