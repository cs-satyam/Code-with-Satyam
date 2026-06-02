package OOPs.StaticKey;

class Demo {
    static int a, b, c;
    int x, y, z;

    static {
        System.out.println("Static init Block");
        a = 10;
        b = 20;
        c = 30;
    }

    static void display() {
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
        System.out.println("sum:" + (a + b + c));
    }

    {
        x = 44;
        y = 66;
        z = 77;
        System.out.println("Java Initialization Block");
    }

    Demo() {
        System.out.println("Constructor");
    }

    void display2() {
        System.out.println("display2");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);
    }
}

public class launch {
    public static void main(String[] args) {
        Demo.display();
        Demo d2 = new Demo();
        d2.display2();
    }
}