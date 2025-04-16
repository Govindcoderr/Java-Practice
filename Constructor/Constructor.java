package com.Constructor;

public class Constructor {

	int x = 10 ;
	Constructor(){
		// this is defaut Constructor and autometicly create with object creation 
	}
	
	public void method()
	{
		System.out.println("this is : X");
	}
	public static void main(String args[])
	{
		// Object creation  
		Constructor b = new Constructor();
		
		b.method();
		
	}
	
}
