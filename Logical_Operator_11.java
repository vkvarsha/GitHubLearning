package javaprogramme;

public class Logical_Operator_11 
{
	
	/* Logical Operator
	 * 
	 *  And ---- &&
	 *  OR ----- ||
	 *  NOT ---- !
	 *  
	 *  
	 *  
	 *  && Operator
	 *  Syntax
	 *  if(condition1 && condition2)
	 * 
	 * Table of && operator
	 * 
	 * Condition1    Condition2       Output
	 * TRUE			 True				True
	 * True			 True				False
	 * False		 False				False
	 * False		 True				False	
	 * 
	 * 
	 * OR Operator
	 * Syntax
	 * if(Condition 1 || Condition 2)
	 * 
	 * Tabel of Or || operator
	 * 
	 * Condition1  Condition2  Output
	 * T			T			T
	 * T			F			T
	 * F			T			T
	 * F			F			F
	 * 
	 * 
	 * Not ! operator
	 * 
	 * ! Operator can be use with &&   or || operator
	 * 
	 * if(!(c1 && c2))
	 * {
	 *  
	 *   }
	 *   
	 *  if(!(c1 || c2))
	 *  {
	 *  
	 *  }
	 *  
	 * 
	 * */ 

	public static void main(String[] args)
	{
	
		int a =10;
		int b =20;
		int c =30;
		
		if(a>b && b>c)
			
		{
			System.out.println("A is Greater than b AND b is greater than c");
		}
		
		
		if (a>b || b>c)
		{
			
			System.out.println("A is greater than b Or B is greater than C");
		}
		
		if(!(a>b && a==b))
		{
			
			System.out.println("Here the output will be execute if a is not greater than b  AND a is not equal to b");
			
		}
		
	}

}
