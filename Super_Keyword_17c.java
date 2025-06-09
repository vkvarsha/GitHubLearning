package javaprogramme;


class Parent2
{
	
void add()
{
	System.out.println("I am  Paent class method");
}

void minus()
{
System.out.println("Parent class minus method");	
}

}

public class Super_Keyword_17c extends Parent2
{
	
	void add()
	{	
		super.add();
		super.minus();
		System.out.println("I am  Child class method");
	}
	
	void minus()
	{
	System.out.println("Child class minus method");	
	}

	public static void main(String[] args)
	{
	/*
	 * Super keyword is has to be used only in case of Method Overriding
	 * To get the parent class method implementation together with the child class implementation
	 * Super keyword is has to be used only in case of Non Static Methods
	 * Super keyword can be the first line of any line inside the Non Static Method
	 * 
	 * 
	 * 
	 * */	
		
		Super_Keyword_17c sk = new Super_Keyword_17c();
		sk.minus();
		sk.add();
		sk.minus();
		
	}

}
