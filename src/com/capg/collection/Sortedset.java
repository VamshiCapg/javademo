package com.capg.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class Sortedset 
{
  public static void main(String[] args)
  {
	  SortedSet ts=new TreeSet();
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
	  System.out.println(ts.headSet(4));
	  System.out.println(ts.first());
	  System.out.println(ts.hashCode());
	  System.out.println(ts.last());
	  System.out.println(ts.size());
	  System.out.println(ts.isEmpty());
	  System.out.println(ts.stream());
	  System.out.println(ts.retainAll(ts));
	  
	  
	  
  }
}
