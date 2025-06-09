package javaprogramme;

class Country2
{
	
		void NH_Road()
		{
			System.out.println("NH ROAD Country");
		}
		
}

class State2 extends Country2
{
	
	void State_Road()
	{
		
		System.out.println("State Road");
		
	}


}
public class Downcasting_City_31A extends State2
{

		void city_road()
		{
			System.out.println("City Roads");
			
		}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		State2 s1 = new Downcasting_City_31A(); //upcasting
		
		Downcasting_City_31A d1 = (Downcasting_City_31A)s1; // downcasting
		
		/* 
		 * By downcasting, can access all child as well as parent class property
		 *  */
		

	}

}
