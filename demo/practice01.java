package com.demo;

public class practice01 {

	 public static  void main(String args[] ){
		 
		 int  day= -0;
		 

		// System.out.println();
		 
		 
		 if (day>0) {
			 
			 if(day>=1&&day<=7) {
				 
				 if(day==1 ||day==2) {
					 System.out.println(day==1? "mon":"Tes");
				 } 
				 else if(day==3 || day==4) {
					 System.out.println(day==3? "Wen":"thre");
				 }
				 else if(day==5 ||day==6) {
					 System.out.println(day==5? "fri":"sat");
				 } else {
				 
					 System.out.println("Sunday");
				 }
			 }
			 else
			 {
				 System.out.println("invalid day ");
			 }
			 
			 
		 }
		 else
		 {
			 System.out.println("invalid Enter  ");
		 }
		 
		 
	 }
}
