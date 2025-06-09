package javaprogramme;

class Parent1
{
	
void add()
{
		System.out.println("I am adding in parent class");
}

}


public class Method_Overriding_17B {
	
	/*Developing a method in parent class with the same name and signature as of the child class
	 * but with different implementation is called method overriding
	 * 
	 * Rules of Method Overriding
	 * 1. Inheritance/Relation should be there
	 * 2.You can only override the Non static Method 
	 * 
	 * 
	 * Note:- if same methods exist in 2 class and got override, Output will be of 1 method only.
	 *  
	 *  */
	
	void add()
	{
		System.out.println("I am adding in child class");
	}

	public static void main(String[] args) 
	{
	
		Method_Overriding_17B mo = new Method_Overriding_17B();
		mo.add();
		
		
	}

}
