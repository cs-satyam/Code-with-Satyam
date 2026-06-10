package OOPs.Inheritance;

class Parent{
     int i=10;
     void disp(){
         System.out.println("Disp of parent");
     }
 }
 class Child extends Parent{
     int i=100;
     void alpha(){
         System.out.println("Alpha");
         System.out.println(i);
         System.out.println(super.i);
//         disp();
         super.disp();
     }
     void disp(){
         System.out.println("Disp of Child");
     }
 }
public class launchInheritance8 {
    public static void main(String[] args) {
        Child c=new Child();
        c.alpha();
        new Child().alpha();
        new Child().disp();

    }
}