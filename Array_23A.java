package javaprogramme;

public class Array_23A {
	
	/*  
	 * Arrays are used to store the homogeneous (same data type) values together
	 * Arrays follows indexing, it can accept null values, it will never accepts  hetrogeneous(different data type) value
	 *  Arrays are know for its fix size
	 *  
	 *  array syntax
	 *  datatype variable[] =  new datatype [size];
	 *  Arrays indexing always start from 0
	 *  
	 *  
	 * "ArrayIndexOutOfBoundsException" can come in case the length of array not defined properly
	 * 
	 * 
	 *  
	 *  */

	
	
	public static void main(String[] args)
	{
		String name []  = new String[3];
		name[0] = "Ram";
		name[1] = "Vishnu";
		name[2] = "Bhim";
		
		//System.out.println(name[0]);
		
		for(int i =0;i<=2;i++)
		{
			System.out.print(name[i]);
			System.out.println("Hey");
			System.out.println(name[i]);
			
		}
		
		//------------------------------------------------------------------------//
		
		int age []  = new int[3];
		age[0] = 32;
		age[1] = 21;
		age[2] = 18;
		
		//System.out.println(name[0]);
		
		for(int i =0;i<=2;i++)
		{
			//System.out.print(age[i]);
			System.out.print("My Age is ");
			System.out.println(age[i]);
			
		}
		
		
		//--------------------------------------------------------------------------------//
		

		double salary []  = new double[3];
		salary[0] = 32000;
		salary[1] = 21259.23;
		salary[2] = 181233;
		
		//System.out.println(name[0]);
		
		for(int i =0;i<=2;i++)
		{
			//System.out.print(age[i]);
			System.out.print(" Salary of " +name [i] + "  is  ");
			System.out.println(salary[i]);
			
		}
		
		for(int i =0;i<=2;i++)
		{
			System.out.println(name[i] + "s age is " + age[i] + " And Having package of " +salary[i]);
			
		}
		
		
	}

}
