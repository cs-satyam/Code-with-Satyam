package Lamda_expression.Nestedclasses;


class A {
    public void show(){
        System.out.println("A in show");
    }
}
class B extends A{
    public void show(){
        System.out.println("B in show");
    }
}
public class Demo0 {
    public static void main(String[] args) {
      A a = new A(){
        public void show(){
            System.out.println("changing in show");
        }
      };
      a.show();
    }
}
