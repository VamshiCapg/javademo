import java.util.Scanner;
public class billgeneration 
{
 public static void main(String[] args)
 {
	 int piza,puf,cool;
	 Scanner s=new Scanner(System.in);
	
	 System.out.println("Enter the no of pizzas bought ");
	 piza=s.nextInt();
	 
	 System.out.println("Enter the no of puffs bought ");
	 puf=s.nextInt();
	 
	 System.out.println("Enter the no of cool drinks bought ");
	 cool=s.nextInt();
	 
	 
	 
	 System.out.println("No of pizzas: "+piza);
	 System.out.println("No of puffs: "+puf);
	 System.out.println("No of cooldrinks: "+cool);
	 double tot=((piza*100)+(puf*20)+(cool*10));
	 System.out.println("Total Price=,"+tot);
	 System.out.println("ENJOY THE SHOW");
	}
}
