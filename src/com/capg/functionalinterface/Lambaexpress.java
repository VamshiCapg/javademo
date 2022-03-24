package com.capg.functionalinterface;
interface Interf
{
	public int square(int a);
}
 class Lambaexpress
{
  public static void main(String[] args)
  {
	  Interf i= a->a*a;
	  /*
	   * public int square(int a)
  		{
   		return a*a;
   		}
	   */
	  int x=i.square(4);
	  System.out.println("Square : "+x);
  }
}
