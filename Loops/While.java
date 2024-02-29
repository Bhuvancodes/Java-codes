package Loops;
import java.util.*;
public class While 
{
    public static void main(String args[])
    {
        Scanner uservalue = new Scanner(System.in);
        int i = uservalue.nextInt();
        while(i<100)
        {
        System.out.println("Jai Shree RAM");  
    
        i++;
        }
        System.out.println("bye");
     uservalue.close();   
    }

}
