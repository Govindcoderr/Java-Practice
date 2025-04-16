package com.condition;

public class practtice08 {

	public static void main(String args []) {
		
		
		   double num1 = 10 , num2 = 2;
		   
		     int choice = 1 ;
           //  1 = add 
		   //  2 = sub
		  //  3 =  multi
		  //  4 = divide 
		 
		   
			switch (choice) {
			
			case 1:
				System.out.println(num1+num2);	
				break ;
			case 2:
				System.out.println(num1-num2);	
				break ;
			case 3:
				System.out.println(num1*num2);	
				break ;
				
			case 4:
				System.out.println(num1/num2);	
				break ;
		
			default :
				System.out.print("invalid Enter choice ");
				
			}
	}
}
