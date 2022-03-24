package corejavacg;

public class test8 extends test7
{
	public void sub(int x, int y)
	{
	System.out.println("Substraction is "+(x-y));

    }

public static void main(String[] args)
{
	test8 t = new test8();
	t.sum(30,40);
	t.sub(20,3);
}
}