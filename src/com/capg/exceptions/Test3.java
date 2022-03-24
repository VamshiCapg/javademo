package com.capg.exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;
//import java.lang.ArithmeticException;
public class Test3 
{
 public static void main(String[] args)
 {   
	 try
	 {
	 int a,b;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a value :");
	 a=sc.nextInt();
	 System.out.println("Enter b value :");
	 b=sc.nextInt();
	 System.out.println("Division of a and b is :"+a/b);
      }
	 catch(InputMismatchException im)
	 {
		 System.out.println("Enter only numerics");
	 }
	 
	 
	 catch(ArithmeticException ae)
	 {
		 System.out.println("Number cannot be divided by zero");
	 }
	 System.out.println("remaining code");
 }
}
//so we can write as many catch block based on the users requirements