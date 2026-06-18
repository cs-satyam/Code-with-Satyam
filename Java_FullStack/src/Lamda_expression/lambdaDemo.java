package Lamda_expression;

abstract class p{
    abstract void show();

}

class newp extends p{
    public void show(){
        System.out.println("new p in show");
    }
}
public class lambdaDemo {
    public static void main(String[] args) {
        p p = new newp();
        p.show();
    }
}
