package com.projects;

public class Calculator {

	double  num1;
	double  num2 ;

	public double Add(double num1,double num2)
	{
		return num1+num2 ;
		
	}
	
	public double Sub(double num1,double num2)
	{
		return num1-num2 ;
		
	}
	
	public double Multi(double num1,double num2)
	{
		if(num1 == 0 ||num2 == 0) {
			System.out.println("Error: ENTER NUMBER IS WRONG .");
		}
		return num1*num2 ;
		
	}
	
	public double Division(double num1,double num2)
	{
		 // Check for division by zero within the method
        if (num2 == 0) {
            System.out.println("Error: Division by zero.");
            return 0;
        }
		return num1/num2 ;
		
	}
	
	public static void main(String  args[])
	{
		
		Calculator calls = new Calculator();
		
		calls.num1=40;
		calls.num2=5.7;
		
		
		System.out.println("Add sum :" + calls.Add(calls.num1,calls.num2));
		System.out.println("sum :" + calls.Sub(calls.num1,calls.num2));
		System.out.println("sum :" + calls.Multi(calls.num1,calls.num2));
		System.out.println("sum :" + calls.Division(calls.num1,calls.num2));
		
		
	}
	
}
