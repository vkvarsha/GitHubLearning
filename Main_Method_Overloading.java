package javaprogramme;

public class Main_Method_Overloading 
{
	void main()
	{
		System.out.println("1");
	}
	

	public static void main(String[] args) 
	{
		// Yes,Main method overloading can be done , with different argument list we can overload main method
		//No, We cannot override the main method. As main method is Static.
		System.out.println(2);
		
		Main_Method_Overloading mm = new Main_Method_Overloading();
		mm.main();
	}

}
