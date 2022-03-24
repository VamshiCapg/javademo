package com.capg.strings;

public class Test4
{  
	public static void main(String[] args)
	{
  StringBuffer s=new StringBuffer("Capg");
  s.append("emini");
  System.out.println(s);
  
  
   StringBuilder a=new StringBuilder("String");
   a.append("Builder");
   System.out.println(a);
 
	}
}
//append() acts as concatination to make string muttable use there are two ways
// StringBuffer class
//StringBuilder class