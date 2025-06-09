package javaprogramme;

public class Block_SIBIIB_13 
{

	/*  Blocks in Java
	 * 1.SIB--> Static initialization block
	 * 
	 * 2.Syntax --
	 * static
	 * {
	 * 
	 * }
	 * 3. How to call --- SIB Get called automatically whenever there is a main method available in programme
	 * SIB get executed first before the main method
	 * SIB can be used to set the pre condition
	 * 
	 * 2.IIB --> instance initialization block
	 * 
	 * 
	 * Syntax ---
	 * {
	 * 
	 * }
	 * IIB get called whenever you called the object
	 * 
	 *  
	 *  
	 *  My Note :-
	 *  Very first SIB will get called whenever Main method present
	 *  then the programme will be run line by line
	 *  Whenever Object get create -- very first IIB will get run and then Constructor will get called
	 *  
	 *  */
	
	Block_SIBIIB_13()
	{
		
		System.out.println("I am your Constructor");
	}
	
	{
		System.out.println(" IIB 1 ");
		
	}
	
	{
		System.out.println(" IIB 2 ");
		
	}
	
	{
		
			System.out.println(" IIB 3 ");
	
	}
		
		
	public static void main(String[] args)
	
	{
		
		
		System.out.println("Main Method");
		Block_SIBIIB_13 SIC = new Block_SIBIIB_13();
		
	}
	
	
	static
	{
		System.out.println("I am your SIB");
	}
	static
	{
		System.out.println("I am your SIB 2");
	}
	static
	{
		System.out.println("I am your SIB  3");
	}
}
