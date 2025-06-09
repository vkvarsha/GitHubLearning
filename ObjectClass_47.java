package javaprogramme;

public class ObjectClass_47 {

	public static void main(String[] args) {
		/*Object class is a super most class in java, which every class inherits implicitly 
		 *  it can use explicitly also by using extend word
		 *  
		 *  In multiple level interface 
		 *  
		 *  						Object class
		 *  		/									\
		 *  	   /					|					 \
		 *     	  /						|				      \
		 *  	 /						|					   \
		 *  	/						|						\
		 *  parent class			parentclass				parentclass
		 *  	\												/
		 *  	 \											   /
		 *  	  \											  /
		 *  	   \										 /
		 *  		\										/
		 *  		 \									   /
		 *  		  \									  /
		 *  					child class
		 *  
		 *  Here it will get confuse which  parent class object class is getting called
		 *  Diamond Problem 
		 *  1.Suppose we are calling super calling statement (calling parent class constructor from child class constructor)
		 *  Here it will confuse which parent class constructor getting called.
		 *  
		 *  */
		
		ObjectClass_47 ob = new ObjectClass_47();
		System.out.println(ob.getClass());
		
		
		
		
		
		
		
	}

}
