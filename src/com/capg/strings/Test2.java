package com.capg.strings;

public class Test2
{
  public static void main(String[] args)
  {
	  String s="rama";
	  String s1="RAMA";
	  System.out.println(s.equals(s1));  //using equals()
	    String s2=new String("capg");
	    String s3=new String("CAPG");
	    System.out.println(s2.equalsIgnoreCase(s3));//Using eualsIgnorecaase
  }
}
