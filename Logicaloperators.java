class logicaloperators
{
    public static void main (String args[])
    {
        double x=9.6;
        double y=11.6;

        int a=10;
        double b=9.6;

        boolean result1 = x<y && a<b;  //And operator
        boolean result2 = x>=b && a>b; //And operator
        boolean result3 = x>=y || a<b;  //or operator
        boolean result4 = x>=y || b==x; // or operator
        boolean result5 = x<=y || b==x && a>11; // (result is based on the presedence ( Order: &&, ||, !) )
        System.out.println(result1);
        System.out.println(result2); 
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(!result5); // result will be opposite in output if [T->f, F->T]
    }
}  