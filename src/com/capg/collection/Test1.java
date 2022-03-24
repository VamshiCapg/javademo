package com.capg.collection;

import java.util.ArrayList;

public class Test1 
{
   public static void main(String[] args)
   {
	   ArrayList<Integer> a=new ArrayList<Integer>();
	   for(int i=1;i<=10;i++)
	   {
		   a.add(i);
	   }
	   //a.add("rama"); cannot add string because of object
	   //only contains integer
	   for(Integer x:a)
	   {
		   if(x%2==0)
		   {
			   System.out.println(x);
		   }
	   }
   }
}
