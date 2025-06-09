package javaprogramme;

public class forloop_14 
{
	
	
	
	/* For Loop
	 * 
	 * Non Tech
	 * for(origin; destination ; increment ,decrement)
	 * {
	 * 
	 * }
	 * 
	 * Tech 
	 * 
	 * for(int i=value; condition; i++/i--)
	 *  {
	 *  
	 *  
	 *  }
	 *  
	 *  
	 *  
	 *  */

	public static void main(String[] args) 
	{
		
	for(int i=0; i<3; i++)
		
	{
		System.out.println("India");
		
	}
	
/*for(int i=1; i>0; i++)
		
	{
		System.out.println("This is infinite loop");
		
	}
	*/	
		
	for(int i =1;i>0;i--)
	{
		System.out.println("Output is " +i);
		
	}
	
	
	for(int i =1;i<0;i--)
	{
		System.out.println(i);
		System.out.println("This wont execute, As condition doesn't match");
	}
	
	
	for(int i=1;i<=20;i++)
	{
		System.out.println("Print value from 1 to 20 "+ i);
	}
	
	
	for(int i=20;i>=0;i--)
	{
		System.out.println("Print value from 20 to 0 "+ i);
	}
	
	for (int i =10;i<10;i++)
	{
		
		System.out.println("Loop wont start ever as condition wont match");
	}
	
	for (int i =50;i<=70;i++)
	{
		
		System.out.println("Print value from 50 to 70  " + i);
	}
	
	}

}
