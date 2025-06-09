package javaprogramme;

public class TypesOfVariables_Local_Global_12 
{
	/* Types of Variables
	 * There are 3 types of variables
	 * 1.Local Variable
	 * 2.Global Variable
	 * 3.Final Variable
	 * 
	 * 
	 * Local Variable  -- brown color
	 * 1.Any variable that declare inside any method is called Local Variable
	 * 2.Scope of local variable is from the begining of the method and end of method
	 * 3.Local variable should not be utilized until and unless it is not initialized with value
	 * 4.Local variable do not have any default value
	 * 5.Local variable cannot be distinguish between static and non static
	 * 
	 * 
	 * public xxxclass
	 * {
	 * 
	 * void add()
	 * {
	 * 			int age = 10;  this is local variable
	 * }
	 * }
	 * 
	 * 
	 *  
	 * Gloabal Variable  - blue color
	 * 1.Any variable which is that is declared outside of method but inside of any class is called as Global Variable
	 * 2.The scope of a Global variable is from beginning of the class to till end of the class
	 * 3.Global variable can be utilized once declared (there is no need to initialize before utilizing)
	 * 4.Global variable will have the default values  
	 * Default values of Global variable
	 * byte/short/int/long  -- 0
	 * float/double -----------0.00
	 *boolean --- false
	 *string -null
	 *char --- no default value
	 * 5.Global variable can be static or non static. Static variable can be call directly but for Non static variable need to create an object of class and then call
	 * 
	 * 
	 * public xxxclass
	 * int salary;  -- this is global variable
	 * {
	 * 
	 * void add()
	 * {
	 * 			int age = 10;  this is local variable
	 * }
	 * }
	 * 
	 * 
	 * 
	 * 	 *   
	 *   
	 *   
	 *   
	 *   */
	
	
	static int age = 100; // global variable
	static int year;
	String name;
	int dol = 34;
	static int my = 89;
	void add()
	{
		int a = 10;  //local method
	System.out.println(100);	
	System.out.println("Add method" +age);
	age = 760;
	System.out.println(age);
	
	}
	
	
	void substract()
	{
		int b = 40;  // local variable
		System.out.println(b); //utilize
		System.out.println("substract " + age);
	}
	
	public static void main(String[] args) 
	{

		TypesOfVariables_Local_Global_12 tg = new TypesOfVariables_Local_Global_12();
		
		System.out.println(age);
		System.out.println(year);
		tg.add();
		
		age =300;
		tg.substract();
		System.out.println("my " +my);
		
		int my =45;
		
		System.out.println("my " + my);
		
		System.out.println(tg.name);
		
	}

}
