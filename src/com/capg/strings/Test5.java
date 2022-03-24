package com.capg.strings;

public class Test5
{
	public static void main(String[] args)
	{
   String s="capgemini";
   String s1="banglore";
   System.out.println(s);
   System.out.println(s1);
   System.out.println("Concatination of two strings :"+s.concat(s1));
   System.out.println("length of string s1:"+s.length());
   System.out.println("check two strings are equal or not :"+s.equals(s1));
   System.out.println("Convert s to uppercase:"+s.toUpperCase());
   String s2="     welcome    ";
   System.out.println("removing spaces from front and back:"+s2.trim());
   
   System.out.println("Character at a position :"+s1.charAt(3));
   
	}
}
