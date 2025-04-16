package Com.day1;

public class All_method {

	// instance variables
	int A = 12;  
	int B = 13 ;
	
	//no parameter With no return type And non static 
	void m1() {
		System.out.println("this is no parameter With no return type And non static  ");
	
	}
	// parameter With no return type And non static 
	void m2(int num1,int num2 ) 
	{
		
		System.out.println("this is parameter With no return type And non static");
		int ab =(num1%num2);
		 System.out.println(ab);
		
		
		//System.out.println(num1+num2);
	}
	int  m3() {
		System.out.println("this is no parameter With return type And non static  ");
		return 12;
	}
	
	String  m4(String name , String lname) {
		System.out.println("this is parameter With return type And non static  ");
		 String fname =name +lname;
		return fname;
	}
	  static String m5(String name , String lname) {
		System.out.println("this is parameter With return type And static  ");
		 String fname =name +lname;
		  return fname;
	  }

	public static void main(String  ars[]) 
	{
	   All_method obj=new All_method();
	   
       System.out.println( obj.A + obj.B);
       
        obj.m1();
       
       
        obj.m3();
       
        System.out.println(obj.m4("Govind", "Singh"));
        
        System.out.println(All_method.m5("charn", "sai"));
        obj.m2(67,23);
	}

	
}
