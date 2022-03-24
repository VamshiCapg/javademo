package com.capg.collection;

import java.util.ArrayList;

public class Test 
{
  public static void main(String[] args)
  {
	  ArrayList a=new ArrayList();
	  
	  for(int i=1;i<=10;i++)
	  {
		  a.add(i);
	  }
	  
		  System.out.println(a);
	   
	  System.out.println("for looop Elements are");
	  for(int i=0;i<a.size();i++)
	  {
		  System.out.println(a.get(i));
	  }
	  System.out.println("For each....");
	  for(Object o:a)
	  {    
		  Integer x=(Integer)o;//typecasting
		  if(x%2==0)
		  {
			  System.out.println(x);
		  }
	  }
  }
}
