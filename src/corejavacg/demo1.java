///method overloading
package corejavacg;

public class demo1 
{
  public void sum(int x,int y)
  {
	  System.out.println("Integer sum is:"+(x+y));
  }
  public void sum(double x,double y)
  {
	  System.out.println("Double sum is "+(x+y));
  }
  public static void main(String[] args)
  {
	  demo1 d=new demo1();
	  d.sum(7.6,8.98);
	  d.sum(3, 4);
  }
}
