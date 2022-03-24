package corejavacg;

public class demo7 implements i2
{   
	@Override
   public void sum(int x,int y) 
   {
	   System.out.println("Sum is"+(x+y));
   }
	
	@Override
	public void sub(int x,int y)
	{
		System.out.println("Sub is "+(x-y));
	}
	public static void main(String[] args)
	{
		demo7 obj=new demo7();
		obj.sum(2, 3);
		obj.sub(4, 2);
	}
}
