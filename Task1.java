import java.util.Scanner;
public class Task1
{
   public static void main(String[]args)
   {
   int num;
   
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter your number:");
   num=sc.nextInt();
   System.out.println();
   
   if(num==0)
   {
   System.out.print(num+" is zero");
   }
   
   
   else if(num%2==0)
   {
   System.out.print(num+" is even number");
   }
   else //if(num%2==1)
   {
   System.out.print(num+" is odd number");
   }
   }//end main
   }//end class
   
   