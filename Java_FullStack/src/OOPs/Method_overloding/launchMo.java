package OOPs;
// Method overloding




class AdditionCal {

    int add(int n1, int n2) {
        System.out.println("Method: add(int, int)");
        return n1 + n2;
    }

    int add(int n1, int n2, int n3) {
        System.out.println("Method: add(int, int, int)");
        return n1 + n2 + n3;
    }

    double add(double n1, double n2) {
        System.out.println("Method: add(double, double)");
        return n1 + n2;
    }

    double add(int n1, double n2, double n3) {
        System.out.println("Method: add(int, double, double)");
        return n1 + n2 + n3;
    }

    double add(double n1, double n2, double n3) {
        System.out.println("Method: add(double, double, double)");
        return n1 + n2 + n3;
    }
    double add(double n1,int n2) {
        System.out.println("Method: add(double, int)");
        return n1+n2;
    }
}

public class launchMo {

    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        int z = 10;

        double a = 10.5;
        double b = 20.5;
        double c = 3.5;

        AdditionCal cal = new AdditionCal();

        System.out.println( cal.add(x, y));
        System.out.println( cal.add(a, b));

        System.out.println( cal.add(a, b, c));
        System.out.println( cal.add(x, y, z));

        System.out.println(  cal.add(x, b, z));
        System.out.println(  cal.add(x, y, c));

        System.out.println(  cal.add(a, y));
    }
}