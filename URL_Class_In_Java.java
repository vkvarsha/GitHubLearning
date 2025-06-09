package javaprogramme;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class URL_Class_In_Java 
{

	/*  
	 * Burpsuite -- tool
	 * Web Security Testing
	 * Penetration Testing
	 * 
	 * 				Request
	 * Client  --------------------------------> Server
	 *         <-------------------------------                               
	 *               Response
	 *               
	 *      
	 *               Penetration Testing
	 *               
	 *  Client ----------------Burpsuite---------server
	 *  	   ----------------------------------
	 *  
	 *  */
	
	public static void main(String[]args) throws MalformedURLException, URISyntaxException
	{
		System.out.println("URL CLASS");
		URI ul = new URI("https://flipkart.com");
		System.out.println(ul.getHost());
		System.out.println(ul.getPort());
		
		String protocol = ul.getScheme();
        System.out.println("Protocol: " + protocol);
        
        String path = ul.getPath();
        System.out.println("Path: " + path);
	
		
		
		
		
	}
	
}
