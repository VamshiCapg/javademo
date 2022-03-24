package com.capg.strings;

public class Test3 
{
 public static void main(String[] args)
 {
	 String s="capg";
	 String s1="Banglore";
	 s.concat(s1);
	 System.out.println(s);
 }
}
//Since strings are immutable we cannot modify the data on top of the string
//here in the above program we are expecting the output as capgBanglore but
//it is not true because we cannot modify to make string muttable refer test4