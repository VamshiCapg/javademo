package corejavacg;

//import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class test0 extends test9
{
 int x=4,y=9;
 public void view()
 {
	 System.out.println("Child class variable of x is"+x);
	 System.out.println("Child class variable of y is"+y);
	 System.out.println("parent class variable of x is"+super.x);
	 System.out.println("parent class variable of y is"+super.y);
	 
	 
 }
 public static void main(String[] args)
 {
	 test0 t= new test0();
	 t.view();
 }
}
