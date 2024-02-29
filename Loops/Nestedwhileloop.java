package Loops;
import java.util.*;
public class Nestedwhileloop
{
    public static void main(String args[])
    {
        Scanner uservalue = new Scanner(System.in);
        int i = uservalue.nextInt();
        while(i<=5)
        {
        System.out.println("hi");  
        int j=1;
             while(j<=3)
             {
               System.out.println("Sir");
               j++;
             }    
        i++;
    
        }
        System.out.println("bye");
     uservalue.close();   
    
    }

}
