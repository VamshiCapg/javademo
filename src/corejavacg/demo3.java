package corejavacg;

public class demo3 extends demo2
{
	@Override
 public void sum(int x,int y)
 {
	 //super.sum(6, 7);
	 System.out.println("Substraction is :"+(x-y));
 }
 public static void main(String[] args)
 {
	 demo3 d=new demo3();
	 d.sum(3,2);
	 
 }
}
