package ClassesandObjects;
import java.util.Scanner;

/**
 * Classesobject
 */

 class Calculator
 {
    public int add()
    {
        Scanner value = new Scanner(System.in);
        int n1 = value.nextInt();
        int n2 = value.nextInt();
        int r=n1+n2;
        value.close();
        return r;
    }
    
 } 
 

class Classesobject {

    public static void main(String args[])
    {
        

        Calculator calc = new Calculator();
        int r =calc.add();
        System.out.println("The Sum of n1 + n2 =" + r);

       
    }
}