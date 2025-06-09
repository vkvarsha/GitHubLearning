package javaprogramme;

public class This_Keyword_22A
{
	
	/* 
	 * this keyword is getting used whenever the gloable variable and local variable are same
	 * by using this keyword , to equal the Local variable value and global variable value  
	 *  
	 * this keyword is getting used only incase of non static method
	 * this keyword can be written anywhere inside the non static method,* unlike this calling statement which has to be written 
	 *  
	 *  */
	
	int age;
	String name;
	double shoesize;
	
	
	void Student(int age,String name ,double shoesize)
	{
		
		System.out.println("Hey i am one of the Student");
		this.age = age; // this keyword used to assign local variable value to global variable value
		this.name =name;
		this.shoesize = shoesize;
	}

	public static void main(String[] args) 
	
	{
		This_Keyword_22A t1 = new This_Keyword_22A();
		t1.Student(23, "Varsha", 23.12);
		System.out.println(t1.age);  //Global variable so default value will be output - 0
		System.out.println(t1.name); //Global variable so default value will be output - null
		System.out.println(t1.shoesize); //Global variable so default value will be output - 0.00
	}

}
