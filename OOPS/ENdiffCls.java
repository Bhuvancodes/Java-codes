package OOPS;
class A {
    private int a;

    public A() {
        this.a = 10;
    }

    public int getA() {
        return a;
    }
}

class B{
    public void accessA() {
        A objA = new A();
        int value = objA.getA();
        System.out.println("Accessing private variable from class B: " + value);
    }
}

public class ENdiffCls {
    public static void main(String[] args) {
        B objB = new B();
        objB.accessA(); // Output: Accessing private variable from class B: 10
    }
}
