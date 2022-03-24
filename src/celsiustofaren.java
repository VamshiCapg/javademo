import java.util.Scanner;
public class celsiustofaren
{
  public static void main(String[] args)
  {
	  float cel, far;

	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter temperature :");
	  cel=s.nextInt();

	  far = cel * 9/5 + 32;

	  System.out.println("Temperature in Farenheit88"+ " "+far);
  
  }
}
