package com.capg.exceptions;

import java.util.Scanner;

public class Test7 
{
 public void checkProductWeight(int weight)
 {
	 if(weight>100)
	 {
		 System.out.println("Product is valid");
	 }
	 else
	 {   
		 try
		 {
			 throw new InvalidProductException();
			 
		 }
		 catch(InvalidProductException ie)
		 {
		 System.out.println("Product weight must be 100");
	   }
    }
 }
 public static void main(String[] args)
 {
	 Test7 t=new Test7();
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter weight");
	 int weight=sc.nextInt();
	 t.checkProductWeight(weight);
 }
}
