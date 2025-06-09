package javaprogramme;

public class Nested_If_10d
{
	// Nested if else
	/*  if (c1)
	 * {
	 * if (c2)
	 * {
	 * 
	 * }
	 * else
	 * {
	 * 
	 * }
	 * else
	 * {
	 * 
	 * }
	 * 
	 * }
	 * 
	 *  
	 *  */

	public static void main(String[] args) 
	{
	
		int a = 100;
		int b = 200;
		
		if(a>b)
		{
			if(a==1000)
				
			{
				System.out.println("A is 1000 and greater than b");
				
			}
			
			else
			{
				
				System.out.println("A is not 1000");
			}

				
		}
		else 
		{
			System.out.println("A is not greater than b");
			
			
		}
	}
	

}
