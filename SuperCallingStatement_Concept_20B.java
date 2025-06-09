package javaprogramme;

class Country
{
	
	Country()
	{
		System.out.println("INDIA");
	}
}

class State extends Country
{
	
	State()
	{
		System.out.println("Maharashtra");
	}
}

public class SuperCallingStatement_Concept_20B extends State
{
	
	SuperCallingStatement_Concept_20B()
	{
		System.out.println("Mumbai");
	}

	public static void main(String[] args) 
	{

System.out.println("Hello I am Manish");
	
SuperCallingStatement_Concept_20B ss =  new SuperCallingStatement_Concept_20B();
	
	}
	

}
