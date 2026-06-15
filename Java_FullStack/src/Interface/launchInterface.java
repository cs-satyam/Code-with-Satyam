package Interface;

interface cal {
    void add(int a, int b);
    void sub(int a, int b);
    void mult(int a, int b);
    void div(int a, int b);
}

class mycalc1 implements cal {

    @Override
    public void add(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

    @Override
    public void sub(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }

    @Override
    public void mult(int a, int b) {
        System.out.println("Multiplication = " + (a * b));
    }

    @Override
    public void div(int a, int b) {
        System.out.println("Division = " + (a / b));
    }
}

class mycalc2 implements cal {

    @Override
    public void add(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

    @Override
    public void sub(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }

    @Override
    public void mult(int a, int b) {
        System.out.println("Multiplication = " + (a * b));
    }

    @Override
    public void div(int a, int b) {
        System.out.println("Division = " + (a / b));
    }
}

class mycalc3 implements cal {

    @Override
    public void add(int a, int b) {
        if (a > 0 && b > 0) {
            System.out.println("Addition = " + (a + b));
        } else {
            System.out.println("Both numbers must be positive");
        }
    }

    @Override
    public void sub(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }

    @Override
    public void mult(int a, int b) {
        System.out.println("Multiplication = " + (a * b));
    }

    @Override
    public void div(int a, int b) {
        System.out.println("Division = " + (a / b));
    }
}

class Algebra {

    void cal(cal c, int a, int b) {
        c.add(a, b);
        c.sub(a, b);
        c.mult(a, b);
        c.div(a, b);
    }
}

public class launchInterface {

    public static void main(String[] args) {

        mycalc1 cal1 = new mycalc1();
        mycalc2 cal2 = new mycalc2();
        mycalc3 cal3 = new mycalc3();

        Algebra a = new Algebra();

        System.out.println("Using mycalc1:");
        a.cal(cal1, 10, 20);

        System.out.println("\nUsing mycalc2:");
        a.cal(cal2, 20, 10);

        System.out.println("\nUsing mycalc3:");
        a.cal(cal3, 30, 15);
    }
}