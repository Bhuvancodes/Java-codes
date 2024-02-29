package Loops;

import java.util.Scanner;

class NestedForLoop {
 public static void main(String args[])
    {
    Scanner uservalue = new Scanner(System.in);
    int i = uservalue.nextInt();
    for(i=1;i<=5;i++)
    {
      System.out.println("Day " + i);
      for(int j=1;j<=9;j++)
      {
        System.out.println(" " + (j+8) + " - " + (j+9));
      }
      uservalue.close();

    }
   
}
}
