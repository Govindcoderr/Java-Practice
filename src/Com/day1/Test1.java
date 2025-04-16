package Com.day1;

public class Test1 
{

	// Default Access modifiers :with in the package ;
	  int num = 100 ;
	  
	  void m1() //Default Access method  
	  {
	    
		  System.out.println("this is Default  method ");
	  }
	  
	  

	  public void m2 () //public Access method  
	  {
		  System.out.println( " m2 is public Access modifiers :everywhere");
	  }
	
	  protected void m3() // protected  Access method  
	  {
		  System.out.println( " m3 is protected Access modifiers :with in the class,in packag subpackage");
	  }
	public static void main(String []args)
	{
		
		Test1 obj= new Test1();
		 System.out.println(obj.num);
		
		 obj.m1();
		 obj.m2();
		 
		
		
	}
	
}
