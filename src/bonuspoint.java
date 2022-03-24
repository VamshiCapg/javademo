
import java.util.Scanner;
     public class bonuspoint{
         public static void main (String[] args) {
             int r,even=1,odd=1;
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter the distance travelled");
             int dist = sc.nextInt();
            if(dist<0)
             {
                System.out.println("Invalid Input");
            }
            else if(dist==0){
                System.out.println("Your bonus points is 0");
            }
            else{
                
                while(dist>0)
                {
                 r= dist%10;
                 even=even*r;
                 dist=dist/10;
                 if(dist>0){
                     r=dist%10;
                     odd=odd*r;
                     dist=dist/10;
                 }
                }
                if(even==odd){
                    System.out.println("Your bonus points is "+(even*2));
                }
                else if(even>odd){
                    System.out.println("Your bonus points is "+(even));
                }
                else{
                    System.out.println("Your bonus points is "+(odd));
                }
            }
        }
     }