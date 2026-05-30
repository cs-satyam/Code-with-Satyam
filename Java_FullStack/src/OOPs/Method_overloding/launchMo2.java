package OOPs.Method_overloding;

public class launchMo2 {

    public static void main(String[] args) {
        System.out.println("main method with string of args[]");
        main(44);
        main("rohan",4);
        main("satyam");
    }

    public static void main(int  args) {
        System.out.println("main method with int  of args");
    }

    public static void main(int[] args) {
        System.out.println("main method with int  of args[]");
    }

    public static void main(String name, int  age) {
        System.out.println("main method with string  and int of  args ");

    }
    public static void main(String name) {
        System.out.println("main method with string   args ");
    }


}
