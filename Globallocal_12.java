package javaprogramme;

public class Globallocal_12 
{

	int age;
	String name;
	double salary;
	
	void student(int age,String name,double salary)
	{
		System.out.println(age);
		System.out.println("Remember I am non static !");
		
	}
	
	public static void main(String[] args) 
	{
		Globallocal_12 g1 = new Globallocal_12();
		g1.student(100, "MKT", 3.12);
		System.out.println(g1.age);
		System.out.println(g1.name);
		System.out.println(g1.salary);
	}

}
