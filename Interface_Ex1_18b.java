package javaprogramme;

interface Auth    //interface
{
	
	void username();
	
	void password();

}




public class Interface_Ex1_18b implements Auth // Concrete class
{
	
	
	public static void main(String[] args) 
	{
		Interface_Ex1_18b ie = new Interface_Ex1_18b();
		ie.username();
		ie.password();
	}

	@Override
	public void username() 
	{

		String uname ="varsha";
		System.out.println(uname);
	}

	@Override
	public void password()
	{

		String pwd = "Varsha@27";
		System.out.println(pwd);
	}

}
