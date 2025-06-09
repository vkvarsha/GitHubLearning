package javaprogramme;

import java.util.ArrayList;
import java.util.Collections;

public class Collection_44A_Arraylist
{

	public static void main(String[] args)
	{

		ArrayList a1 = new ArrayList();
		a1.add("Varsha");
		a1.add("Ram");
		a1.add("Seeta");
		a1.add("Laxman");
		
		Collections.sort(a1);
		
		
		
		a1.add(null);
		
		
		
		a1.add(99);
		a1.add(23.11);
		
		a1.add('V');
		
		System.out.println(a1);
		

	}

}
