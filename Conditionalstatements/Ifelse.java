package Conditionalstatements;

class ifelse
{
   public static void main (String args[])
   {
    int x=100;
    int y=8;
    int z=18;
    if (x>y && y>z)
    {
        System.out.println(x);
        System.out.println(x + " is greater");
    }
    else if (y>z && y>x)
      {
        System.out.println(y);
      }
    else
    {
        System.out.println(z);
    }

   } 
}
