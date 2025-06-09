package javaprogramme;

public class StaticMethod_5
{

	
	public static void calltype()
	{
		System.out.println("This is Static method");
		
		
	}
	
	public static void add()
	{
		System.out.println("This is add method");
	}
	
	public static void substract()
	{
		System.out.println("This is substract method");
	}
	
	public static void Multiply()
	{
		System.out.println("This is Multiply method");
	}
	
	public static void Divide()
	{
		System.out.println("This is Divide method");
	}
	


	public static void main(String[] args) 
	{
		calltype();
		System.out.println("to add psvm method automatically write main and then  ctrl + space + enter");
		calltype();
		System.out.println("Static method can be called just by mentioning the name of method like methodname()");
		System.out.println("Create programme to write 4 static method and call it in main method");
		add();
		substract();
		Multiply();
		Divide();
	}

}
