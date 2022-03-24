import java.util.Scanner;
public class leapyear
{
  
  public static void main(String[] args)
  {
	  int n;
	  System.out.println("Enter year");
	  Scanner sc=new Scanner(System.in);
	  n=sc.nextInt();
	  if (((n % 4 == 0) && (n % 100!= 0)) || (n%400 == 0))
	  {
		  System.out.println("The given year is leap year");
	  }
	  else if(n<0)
	  {
		  System.out.println("Invalid year");
	  }
	  else
	  {
		  System.out.println("Not a leap year");
	  }
		  
	  
  }
}
