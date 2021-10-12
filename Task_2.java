import java.util.Scanner;
public class Task_2
{
   public static void main(String[]args)
   {
    Scanner sc = new Scanner(System.in);
      int maximum=0,minimum=0,average=0,total=0,i=1,num;
      System.out.println("Please enter an integer OR 0 to stop\n");
      do
      {
      System.out.print("Enter an integer: ");
      num=sc.nextInt();
      System.out.println();
      
      if (num == 0)
      break;
      total+=num;
      average=total/i;
        if (num==0)
        break;
        if(num>maximum)
            maximum=num;
        if(i==1)
        minimum=num;
        else if(num<minimum)
        minimum=num; 
        i++;
     }while(num!=0);
     System.out.println("");
     System.out.println("Total= "+total);
     System.out.println("Average= "+average);
     System.out.println("Maximum= "+maximum);
     System.out.println("Minimum= "+minimum);
   }//end main
   }//end class