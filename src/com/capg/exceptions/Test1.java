package com.capg.exceptions;
import java.util.Scanner;
public class Test1 
{
 public static void main(String[] args)
 {     
	 int a,b;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a value :");
	 a=sc.nextInt();
	 System.out.println("Enter b value :");
	 b=sc.nextInt();
	 System.out.println("Division of a and b is :"+a/b);
 }
}
//Supppose if we are passing b value as a character then
//java.util.InputMismatchException this exception will occur to handle this exception
// we can use try and catch block