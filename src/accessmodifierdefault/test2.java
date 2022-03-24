package accessmodifierdefault;
// we can access from another class within in the same package
public class test2 
{
 public static void main(String[] args)
 {
	 test1 o=new test1();
	 System.out.println("System.out.println :"+o.a);
 }
}
//from other package class we cannot access default