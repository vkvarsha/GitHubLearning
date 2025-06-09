package javaprogramme;


 class Encap1
{
	private String username = "varsha.kadam";	
	private int age = 25;
	private double salary = 85000;	
	private float bonus = 25000;	
	private char love = 's';
	private boolean snor =false;
	
	public String get_username()
	{
		return username;
	}

	public void set_username(String username)
	{
		this.username=username;
	}

	
	}
 
 

public class Encapsulation_39
{
	/* Protecting the data member(variable/method) of the class by restricting the direct access
	 * using the Private access specifier is called as Encapsulation
	 * But providing the indirect access using getter and setter
	 * Getter  -- get the value
	 * Setter  -- set the value
	 * 
	 * Access specifier should be public for getter and setter
	 * and non static method
	 * 
	 * class login fb
	 * {
	 * 
	 * private String UN
	 * 
	 * 
	 * public void get_un()
	 * {
	 * 
	 * }
	 * 
	 * public void set_UN()
	 * {
	 * 
	 * } 
	 * }
	 * }
	 *  */
	
	
	




	public static void main(String[] args) 
	{
	
		Encap1 e1 = new Encap1();
		e1.set_username("Varsha kadam");
		
	}

}
