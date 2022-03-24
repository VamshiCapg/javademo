package com.capg.exceptions;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Test2 
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
	 
	System.out.println("remaining code"); 
	 
 }
}
//try block must be followed with catch block