package javaprogramme;

import java.util.Scanner;

public class Scanner_Class_Concept_16A {

	public static void main(String[] args) 
	{
		// Scanner class is the pre defined class of Java

		Scanner sc = new Scanner(System.in);
		
		String My =	sc.next(); // String value
		System.out.println(My);
		
		int a1 = sc.nextInt();// integer value
		int a2 =	sc.nextInt();
	
		int a3 = a1+a2;
		System.out.println(a3);
		
	
		
		
		
	}

}
