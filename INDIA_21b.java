package javaprogramme;

public class INDIA_21b
{
	INDIA_21b()
	{
		this("Maratha"); // this is the way to call another constructor within a class
		System.out.println("I live in India");
	}
	
	INDIA_21b(String State)
	{
		this("Maratha","Mumbai");
		System.out.println("I live in Maharashtra");
	}

	
	INDIA_21b(String State,String City)
	{	
		this(24.32f);
		System.out.println("I live in Maharashtra and Aamchi Mumbai");
	}
	
	INDIA_21b(float wow)
	{	
		System.out.println("I live in Maharashtra and Aamchi Mumbai");
	}

	public static void main(String[] args) 
	{
		new INDIA_21b();
		// new INDIA_21b("Maratha"); // earlier we were calling like this
		
		

	}

}
