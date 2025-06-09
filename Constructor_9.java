package javaprogramme;

public class Constructor_9 
{
	
	 Constructor_9()
	{
		System.out.println("Hi i am constructor");
		/*
		1. Constructor is the special method type in java which has same name as Classname
		2.Constructor is a Non static method
		3.Constructor does not have any return type
		4.Constructor can have all different type of access specifier
		
		How to call the constructor
		Constructor get auto called on create an object of classi
		OR
		After Creating an object constructor get called automatically
		
		
		*/
		
	}
	 
	 

	 
	 Constructor_9(int a, char b, String d)
	 {
		 /* 
			 * Constructor Overloading
			 * 
			 *  Developing multiple constructor but variance in the argument list
			 *  For calling
			 *  Create object with no para, Constructor with no para will get called
			 *  Create object with para, Respective constructor (matched to para) will get called.
			 *  */
		 	System.out.println("This is Constructor overloaded 1");
	 }

	 Constructor_9(int a, char b)
	 {
		 
		 System.out.println("This is constructor overload 2");
		 
	 }
	 Constructor_9(int a, float b)
	 {
		 
		 System.out.println("This is constructor overload 3");
		 
	 }
	 
	public static void main(String[] args) {
		

		Constructor_9 c9 = new Constructor_9();  //create object way 1
		
		new Constructor_9(); // create object way 2
		
		new Constructor_9(10, 'm',"yoyo");	
		
		new Constructor_9(9,3.4f);
		
	}

}
