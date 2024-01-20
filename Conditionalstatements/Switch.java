package Conditionalstatements;

import java.util.*
;

public class Switch
 {
    public static void main(String args[])
     {
        Scanner uservalue = new Scanner(System.in);
        int a = uservalue.nextInt();
        switch (a) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a value between 1 to 7");
        }
        
        uservalue.close(); // Close the Scanner
    }
}