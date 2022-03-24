package corejavacg;

public class test6 extends test5
{
  int x=200;
  public void display()
  {
	  System.out.println("Child class variable value is "+x);
	  System.out.println("Super class variable value is"+super.x);
  }
  public static void main(String[] args)
  {
	  test6 t=new test6();
	  t.display();
  }
}
