package corejavacg;

public class test3 
{
 public test3()
 {
	 System.out.println("I am parent class default constructor");
 }
 public test3(int x)
 {
	 this();
	 System.out.println("I am parent class parameterized constructor");
 }
}
