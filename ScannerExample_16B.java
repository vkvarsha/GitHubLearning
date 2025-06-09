package javaprogramme;

import java.util.Scanner;


public class ScannerExample_16B 
{

	static int a;
	static int b;
	static int cc;
	
	
	static void Addition()
	{
		cc = a + b;
		System.out.println("Addition is " + cc);
	}
	
	static void Substract()
	{
		cc = a - b;
		System.out.println("Substraction is " +cc);
	}
	
	static void Multiply()
	{
		 cc = a * b;
		System.out.println("Multiplication is " +cc);
	}
	
	static void Divide()
	{
		cc = a / b;
		System.out.println("Divide is " + cc);
	}
	
	
	public static void main(String[] args) 
	{
		
		ScannerExample_16B se = new ScannerExample_16B();
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b=sc.nextInt();
		
		
		se.Addition();
		se.Substract();
		se.Multiply();
		se.Divide();
		
		
	}

}
