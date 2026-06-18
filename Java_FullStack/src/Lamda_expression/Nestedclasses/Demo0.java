package Lamda_expression.Nestedclasses;


class A {
    public void show(){
        System.out.println("A in show");
    }
    public void display(){
        System.out.println("b in display");
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
          //we can't re-use it
        public void show(){   // Anonymous inner class

            System.out.println("changing in show");
        }
        public void display(){
            System.out.println("changing in display");
        }
      };
      a.show();
      a.display();
//          anonymous object
//         can't re-use
      new B().show();

    }
}
