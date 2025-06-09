package javaprogramme;


class Learning
{
	
	Learning()
	{
		System.out.println("Learing Calling constructor");
	}

	
	void mauj() 
	{
		System.out.println("Non Constructor method");
	}
	
	Learning(int a)
	{
		System.out.println("This is parameterised constructor" +a);
	}
}

class Teachingsupercalling extends Learning
{
	Teachingsupercalling()
	{
		super(100);
	System.out.println("Teachingsupercalling constructor");
	} 
	
	Teachingsupercalling(String voice)
	{
		System.out.println("This is String constructor output " + voice);
	}
}



public class SuperCallingStatement_Concept_20A extends Teachingsupercalling
{
	
	
	
	SuperCallingStatement_Concept_20A()
	{
		super("varsha");
		
		System.out.println("SuperCallingStatement_Concept constructor");
		
	}
	
	/* 
	 * 1.Constructors cannot be inherited
	 * Super calling statement is used to call parent class constructor from child class constructor
	 * 
	 * 
	 * 
	 * 
	 * super calling statement are of 2 types
	 * Implicit super calling statement
	 * 			It is present by default but you can't see it
	 * Implicit super calling statement can be written as below
	 * 	super();
	 * 
	 * It is used to call parent class constructor from child class constructor which doesn't have parameters
	 * 
	 *  Writing super calling statement is not mandatory , It is present by default
	 *  
	 *  
	 *  --------------------------------------------------------------------------
	 *   
	 * Explicit super calling statement
	 * 		
	 * This also called as Parameterized super calling statement
	 * it should be written like    super(parameter);
	 * 
	 * Parameterized super calling statement is used to call child class constructor to the parent class constructor which is parameterized in nature
	 * parameterized super calling statement has to be written explicitly
	 * 
	 * 
	 * 
	 * 
	 * Super calling statement should be use when multiple class present and having relation with each other
	 *  */
	
	
	
	
	
	public static void main(String[] args) 
	{
	
		
		SuperCallingStatement_Concept_20A sc = new SuperCallingStatement_Concept_20A();
		
		
	}

}
