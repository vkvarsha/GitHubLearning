package javaprogramme;


 class Teacher
{
	 void Teachjava()
		{
			
			System.out.println("Teaching java");
		}
		
		void TECHselenium()
		{
			
			System.out.println("Teaching selenium");
		}
	 


}


public class TypeCasting_31  extends Teacher
{
	
	void java()
	{
		
		System.out.println("Learning java");
	}
	
	void selenium()
	{
		
		System.out.println("Learning selenium");
	}

	// Converting one type to another type is called Type Casting
			/*Type Casting
			 * 
			 * 
			 * Primitive Type Casting   -- Converting one data type to another data type is called primitive type casting
			 * Primitive type casting can be done by 2 ways  --only work for byte,short,int,long,float,double data type.
			 * a.Narrowing --> Converting bigger data type to smaller data type is called as Narrowing type casting.
			 * 					It can be done explicitly only
			 * 
			 * b.Widening --> Converting smaller data type to bigger data type is called Widening type casting
			 * 					It can be done by both implicitly or explicitly
			 * 	--------------------------------------------------------------------
			*Class Type Casting ---> Converting one class type to another class is called class type casting.
			*Class type casting can be done by 2 ways 
			* a.Upcasting --> Converting child class object to Super Class type is called as up casting
			* 					It can be done by both implicitly as well as explicitly
			* 
			* b.Downcasting --> Converting super class object to the sub class type is called as Down casting.
			* 					It can only be done explicitly.
			* 					
			* Downcasting is not possible without upcasting.
			* 
			* 
			* 					parent class
			* 
			* 
			* 
			* 	downcasting 						upcasting
			* 
			* 
			* 
			*
			* 					child class           ^
			*
			*
			*Syntax --> 
			*
			*new student();
			*
			*Teacher
			*{
			*
			*}
			*
			*class Student
			*{
			*
			*teacher t1 = new student();
			*}
			*/

			//UPCASTING
	
				
	
	public static void main(String[] args) 
	{
	
		/* byte ,short,int,long,float,double
		
		>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> --- Widening
		
		<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<---- Narrowing
						
	*/
		//Convert int into double
		
		int wt = 85;
		double wt1 = wt;			// implicit way --- Widening
		System.out.println(wt1);  
		
		int jd = 45;
		double jd1 = (double) jd;	//explicit way -- Widening
		System.out.println(jd1);   
		
		
		
		// Converting double into int
		
		double ww = 76.87;  
		int ww1=(int) ww;   // explicit way  --- Narrowing
		System.out.println(ww1);
		
		byte weighment = 34;
		long weight2 = (long)weighment;  // explicitly
		long weight3 = weighment;
		
		long world = 87666;
		byte www2 = (byte)world;
		
		
		Teacher t1 =  new TypeCasting_31(); //Upcasting is used To remove the relation , can access only parent class property and cant access child class property
		//t1.Teachjava();
		//t1.TECHselenium();
		//This topic will help for parellel testing or cross browser testing
		TypeCasting_31 s1 = (TypeCasting_31)t1;  // downcasting // by this you can access both child as well as parent class properties
		
	}

}
