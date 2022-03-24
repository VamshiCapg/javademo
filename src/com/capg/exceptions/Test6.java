package com.capg.exceptions;
import java.util.InputMismatchException;
//import java.util.Scanner;
public class Test6 extends Test5
{
   public static void main(String[] args)
   {
	   Test5 t=new Test5();
	  // Scanner sc=new Scanner(System.in);
	   //sc=t.nextInt();
	   try
	   {
		   t.division(10,0);
		   
	   }
	  /* catch(InputMismatchException im)
		 {
			 System.out.println("Enter only numerics");
		 } */
		 
		 
		 catch(ArithmeticException ae)
		 {
			 System.out.println("Number cannot be divided by zero");
		 }
	   System.out.println("Rest of code is executed");
   }
}
