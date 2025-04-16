package com.Constructor;

public class Constructor01 {

	String name;
	int age ;
	double salary;
	String fname;
	
	 public Constructor01(int Eage ,String Ename ,double Esalary){
		
		age =  Eage;
		name = Ename; 
		salary =Esalary;
	}
	 
	 public Constructor01(int A ,int B)
		{
		 System.out.println(A+B);
	
		}
	
	 
	public void method()
	{
		System.out.println(" Employee name is : "+name +fname+"\n Employee age is:"+age+ "\n Employee salary  is :"+salary);
	}
	public static void main(String args[])
	{
		
	
	   Constructor01 d = new Constructor01(23,"govind",150000);
	
		d.fname="Singh";
		d.method();
		
		
		
	}
	
}
