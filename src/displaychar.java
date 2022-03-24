import java.util.Scanner;
 public class displaychar{
     public static void main(String args[]){
         
         Scanner sc=new Scanner(System.in);
         
         System.out.println("Enter the digits:");
         int a=sc.nextInt();
         int b=sc.nextInt();
         int c=sc.nextInt();
         int d=sc.nextInt();
        
         char i=(char)a;
         char j=(char)b;
         char k=(char)c;
         char l=(char)d;
        
         System.out.println(a+"-"+i);
         System.out.println(b+"-"+j);
         System.out.println(c+"-"+k);
         System.out.println(d+"-"+l);
     }
 }
