package com.capg.functionalinterface;
interface Interf{ 
	   
public int square(int a);

}
//implementation class
class Test1 implements Interf
{
  public int square(int a)
  {
   return a*a;
   }
   public static void main(String[] argds)
   {
       Interf i = new Test1();
	   int square = i.square(3);
	   System.out.println("square of the given no is: " + square);
   }
}
 

	 
 

 
