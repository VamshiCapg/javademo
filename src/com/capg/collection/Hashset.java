package com.capg.collection;

import java.util.HashSet;

public class Hashset 
{
 public static void main(String[] args)
 {
	 HashSet hs=new HashSet();
	 hs.add(new Integer(100));
	 hs.add(new Float(3.4f));
	 hs.add(new Integer(100));
	 hs.add(null);
	 hs.add(new String("hello"));
	 System.out.println(hs);
 }
}
//does not allows duplicates
//insertion order is not preserved which means that we cant
//predict.