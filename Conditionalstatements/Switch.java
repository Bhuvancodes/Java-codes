import java.util.*;
package Conditionalstatements;
public class Switch 
{
  public static void main (String args[])
  { 
  Scanner uservalue = new Scanner (System.in);
  int a = uservalue.nextInt();
  switch(a)
  {
    case 1:
         System.out.println("Monday");
    case 2:
         System.out.println("Tuesday");
    case 3:
         System.out.println("Wednessday");
    case 4:
         System.out.println("Thursday");
    case 5:
         System.out.println("Friday");
    case 6:
         System.out.println("Saturday");
    case 7:
         System.out.println("Sunday");
  }
  System.out.println("Enter Value between 1 to 7");
  }

}
