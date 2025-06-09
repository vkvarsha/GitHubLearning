package javaprogramme;

public class IfElseIfBloc_10c 
{

	/* 
	 * if else if block
	 * Syntax
	 * if (condition 1)
	 * {
	 * 
	 * }
	 * 
	 * else if(condition 2)
	 * {
	 * 
	 * 
	 * }  
	 * else if (condition 3)
	 * 
	 *   {
	 *   	
	 *   }
	 *   
	 *   
	 *   Note :- which ever condition turns true first will be the output
	 *   
	 *   
	 *   */


	public static void main(String[] args) 
	{
	
	int a =10;
	int b =20;
	int c =30;
	
	if (a>b)
	{
		System.out.println("A is greater than B");
	}
			
	else
		if(b>c)
		{
			System.out.println("B is Greater than C");
		}
		else if (c>a)
		{
			
			System.out.println("C is greater than a");
			
		}
		else 
		{
			System.out.println("There is any duplicate value");
		}
	}

}
