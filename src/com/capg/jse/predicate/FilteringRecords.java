package com.capg.jse.predicate;

import java.util.ArrayList;

public class FilteringRecords
{ 
 public static void main(String[] args)
 {
	 ArrayList<Integer> al=new ArrayList<Integer>();
	 for(int i=0;i<=10;i++)
	 {
		 al.add(i);
	 }
	 System.out.println(al);
	 ArrayList<Integer> l2=new ArrayList<Integer>();
	 for(Integer i:al)
	 {
		 if(i%2==0)
			 l2.add(i);
	 }
	 System.out.println("Even numbers are   ::"+l2);
	 
 }
}
