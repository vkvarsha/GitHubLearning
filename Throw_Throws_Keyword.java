package javaprogramme;

public class Throw_Throws_Keyword 
{
	
	/* throw --> throwing exception
	 * syntax
	 * throw new ExceptionName("Message if Required");
	 * 
	 *  throws :- write next to methods with throws word
	 *  
	 *  
	 *  throw  - throw used to throw an exception. throw inside the method.Single exception
	 *  throws - throws used to declare an exception. declare together with the method.Multiple exception with help of comma
	 *  
	 *  */

	public static void main(String[] args) 
	{
	
		int age =10;
		if(age>18)
		{
			
			System.out.println("Open www.youtube.com");
			
		}
		else
		{
			throw new NullPointerException("The user age is less than 18");
		}
		
		
		
		
		
		
	}

}
