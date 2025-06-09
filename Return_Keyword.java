package javaprogramme;

public class Return_Keyword 
{
	
	int add(int a,int b)
	{
		
		int c=a+b;
		return c;
		
	}
	
	double add(int a,double b)
	{
		
		double c=a+b;
		return c;
		
	}

	public static void main(String[] args)
	{
		
		Return_Keyword rk = new Return_Keyword();
		rk.add(12, 23.11);
		rk.add(12, 12);
		System.out.println(rk.add(12, 12));
		
		
	}

}
