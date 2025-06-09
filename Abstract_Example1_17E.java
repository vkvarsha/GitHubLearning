package javaprogramme;


abstract class Authentication
{
	abstract void username();
	

	static void map() 
	{
		System.out.println("I am static method");
	}
	
	 void road() 
	{
		System.out.println("I am Non static method");
	}
	
	
	
}



public class Abstract_Example1_17E extends Authentication
{

	@Override
	void username()
	{
	
		String uname ="varsha";
				System.out.println(uname);
				System.out.println("Username to login in 3rd party tool");
	}
	
	public static void main(String[] args) 
	{
	
		Abstract_Example1_17E ae2 = new Abstract_Example1_17E();
		ae2.username();
		map();
		ae2.road();
		
	}



}
