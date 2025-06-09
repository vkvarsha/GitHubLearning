package javaprogramme;

public class FinalVariable_12 
{
	/*Final variable is variable which value cannot be changed
	
	* Syntax
	* final int a =100;
	* final keyword is applicable for method,variable and class
	* any variable that is final cannot change its value
	* any class that is final cannot be inherited
	* any method that is final cannot be overriden
	* 
	* 
	*
	*/
	final static int a = 100; // this value cannot be change throught the class
	final int noofdaysyear = 365;
	
	public static void main(String[] args)
	{
		final int w = 90;  // value cannot be change throught this method
		System.out.println(a);
		System.out.println(w);
		
		final double pi=3.14;
		
	}

}
