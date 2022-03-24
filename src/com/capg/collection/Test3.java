package com.capg.collection;

//import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Test3 
{
  public static void main(String[] args)
  {
	 // SortedSet ts=new TreeSet();
	  TreeSet<Integer> ts=new TreeSet<Integer>(new MyComparator());
	  ts.add(new Integer(4));
	  ts.add(new Integer(40));
	  ts.add(new Integer(42));
	  ts.add(new Integer(43));
	  ts.add(new Integer(45));
	  ts.add(new Integer(224)); 
	  ts.add(new Integer(24));
	  ts.add(new Integer(14));
	  ts.add(new Integer(04));
	  System.out.println(ts);
	  
	  
	  
  }
}

