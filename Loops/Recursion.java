package Loops;
import java.util.Scanner;
public class Recursion {
    public static int factorial(int n) {
        // Base case: if n is 0 or 1, return 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: n * factorial(n-1)
        else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        scanner.close(); 

        int result = factorial(number);
        System.out.println("Factorial of " + number + " = " + result);
    }
}
/* 
If the input n is greater than 1, the method calculates the factorial by multiplying n with the factorial of n-1. 
This is where recursion occurs. The method calls itself with the argument n - 1, reducing the problem into a smaller subproblem.

Let's trace the recursion with an example:

Suppose the user enters 5 as the input. Here's how the recursion works:

factorial(5) is called.
Since n is not 0 or 1, the method returns 5 * factorial(4).
Now, factorial(4) is called.
Again, since n is not 0 or 1, the method returns 4 * factorial(3).
This continues until the base case is reached.
When factorial(1) is called, it returns 1.
The chain of recursive calls unwinds, and the result is computed as 5 * 4 * 3 * 2 * 1, which equals 120.
*/ 