package javaprogramme;


interface FbAuth
{
	
	void un();
	void pwd();
}


interface OrkutAuth
{
	
	void oun();
	void opwd();

}

public class MultipleInheritance_interfaeConcept_18d implements FbAuth,OrkutAuth

{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void oun() {
		System.out.println("Orkut ID");
		
	}

	@Override
	public void opwd() {
		System.out.println("Orkut pwd");
		
	}

	@Override
	public void un() {
		System.out.println("Facebook ID");
	}

	@Override
	public void pwd() {
		System.out.println("Facebook Pwd");
		
	}

}
