package OOPS.Inheritance;

public class BasicCal {
    public static void main(String[] args) {
        Calc obj = new Calc();
        int r1 = obj.add(4, 6);
        int r2 = obj.sub(2,4);
        System.out.println("addition is"+ " "+ r1 );
        System.out.println("addition is"+ " "+ r2 );
    }
}