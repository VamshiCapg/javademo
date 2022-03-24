package com.capg.collection;

import java.util.LinkedHashSet;

public class Linkedhashset 
{
  public static void main(String[] args)
  {
	  LinkedHashSet lhs=new LinkedHashSet();
	  lhs.add(new Integer(100));
	  lhs.add(null);
	  lhs.add(new Integer(200));
	  lhs.add(null);
	  lhs.add(new Float(3.24f));
	  lhs.add(new Integer(100));
	  lhs.add(new String("Hello"));
	  System.out.println(lhs);  }
}
//not allows duplicates
//we can get the data as preserved