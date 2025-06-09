package javaprogramme;



interface GoogleAuth
{
	
	//No concrete method can be written in interface , only abstract method can be written without abstract keyword
	
	void Googleuname();
	void Googlepwd();
	
}


interface PlantAuth extends GoogleAuth
{
	
	//No concrete method can be written in interface , only abstract method can be written without abstract keyword
	
	void Plantuname();
	void Plantpwd();
	
}

abstract  class AmazonAuth implements PlantAuth,GoogleAuth
{
	
	abstract void Amazoneuname();
	abstract void Amazonepwd();
	static void OTP()
	{
		System.out.println("otp is Static Method");
	}
	
	void hyperlink()
	{
		
		System.out.println("Link is Non Static method");
	}
	
}

public class Interface_Ex2_18c extends AmazonAuth
{

	
	public static void main(String[] args) 
	{
		Interface_Ex2_18c ie8 = new Interface_Ex2_18c();
		ie8.Googleuname();
		ie8.Googlepwd();
		ie8.Amazoneuname();
		ie8.Amazonepwd();
		ie8.OTP();
		ie8.hyperlink();
		ie8.Plantuname();
		ie8.Plantpwd();
		
	}

	@Override
	public void Googleuname() {

		String guname = "varshag";
		System.out.println(guname);
		
	}

	@Override
	public void Googlepwd() {


		String gpwd = "pwdg";
		System.out.println(gpwd);
	}

	@Override
	void Amazoneuname() {

		String amzuname = "varshaaz";
		
	}

	@Override
	void Amazonepwd() {
		String amzpwd = "pwdamz";
	}

	@Override
	public void Plantuname() {
		System.out.println("Plant username");
	}

	@Override
	public void Plantpwd() {
		System.out.println("Plant password");
	}
}
