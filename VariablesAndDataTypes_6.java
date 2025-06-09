package javaprogramme;

public class VariablesAndDataTypes_6 {

	public static void main(String[] args)
	{
	
		System.out.println("Datatypes  are"
				+ " byte,short,int,long to store numbers"
				+ "float ,double to stroe decimal value"
				+ "char --- to store character like A, h, s,"
				+ "String -- to store word like home, name"
				+ "boolean -- to store value as true or false");
		
		
		byte ram = 57;
		int vishnu =  98;
		
		
		/* Here byte and int are data type  and ram and vishnul are variable  
		 * 
		 * Formula to calculate the range of Datatype
		 * -2(n-1)   to 2(n-1)-1   (n stand here for bits)
		 * 
		 * 1TB =  1024 GB
		 * 1GB = 1024 MB
		 * 1 MB = 1024 KB
		 * 1KB = 1024 BYTE
		 * 1 Byte = 8 bits
		 * 
		 * 
		 * 
		 * 
		 * 
		 *				size in byte    size in bits 
		 * byte           1                  8
		 * short          2                  16
		 * int            4                  32
		 * long           8                  64
		 * 
		 * 
		 * -2(n-1)   to 2(n-1)-1
		 * range of byte 
		 * -2(8-1)  to 2(8-1)-1
		 * -2(7)    to 2(7)-1
		 * -128     to  +127
		 * 
		 * 
		 * 
		 * range of short data type
		 * -2(n-1)  to 2(n-1)-1
		 * -2(16-1) to 2(16-1)-1
		 * -2(15)   to 2(15)-1
		 * -32768   to  32767
		 * 
		 * 
		 * range of int data type
		 * -2(n-1)  to 2(n-1)-1
		 * -2(32)  to 2(32-1)-1
		 * 
		 * 
		 * */
				
			byte a =10; // declaration and initialization
			short b; // initialization
			b =100;//declaration
			int c =2334;
			long d = 2345676;
			double e = 33.22;
			float g =34.23f;
			char h ='w';
			
			boolean a2 = true;
			String word = "Testing as per data type";
			
			System.out.println(a);
			
			
			short m =100;
			System.out.println(m);
			
			
			String w = "abc";
			char x[] = {'a','b','c'};
			String data = new String(x);
			System.out.println("Here is" +data);
			
			
			//Syntax of datatype && variable //
			
		//	datatype variable = value/literal ;
			
			float t = 343432.23f;
			System.out.println(t);
			
			
			
			
		
		

	}

}
