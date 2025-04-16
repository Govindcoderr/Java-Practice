package com.condition;

public class practice07 {
	
	public static void main(String args []) {
		
        char grade = 'E';
		
		switch (grade) {
		
		case 'E':
			System.out.print("Eccellent");	
			break ;
		case 'V':
			System.out.print("very good ");	
			break ;
		case 'G':
			System.out.print("good ");	
			break ;
			
		case 'A':
			System.out.print("average");	
			break ;
		case 'F':
			System.out.print("fail");	
			break ;
		default :
			System.out.print("Try next time year");
			
		}
		
		
	}

}
