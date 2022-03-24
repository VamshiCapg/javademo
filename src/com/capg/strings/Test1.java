package com.capg.strings;

public class Test1 
{
  public static void main(String[] args)
  {
	  String s="rama";
	  String s1="rama";//string literal
	  System.out.println(s);
	  System.out.println(s1);
	  System.out.println(s==s1);
	  
	  
	  String s2=new String("raama");// string using new
	  String s3=new String("raama");
	  System.out.println(s2==s3);
   }
}
