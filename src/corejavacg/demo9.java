package corejavacg;

public class demo9
{
  public static void main(String[] args)
  {
	  bank obj=new CityBank();
	  System.out.println("CityBank RI is"+obj.getRateOfInterest());
	  bank obj1=new hdfc();
	  bank o=new SBI();
	  System.out.println("HDFC RI is"+obj1.getRateOfInterest());
	  System.out.println("SBI RI is "+o.getRateOfInterest());
	  
  }
}
