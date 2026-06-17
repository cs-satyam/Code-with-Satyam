package Lamda_expression.Nestedclasses;
class animal{
    public void eat(){
        System.out.println("eating");
    }
    // member of main class alpha
    static class dog{
        public void type(){
            System.out.println("dog is eating fish");
        }
    }
    // member of main class alpha
    class deer{
        public void type(){
            System.out.println("Deer is eating grash");
        }
    }

//     member can be static or non-static
}
public class Demo2 {
    public static void main(String[] args) {

        animal a = new animal();

//        access static class
        animal.dog dog = new animal.dog();
        dog.type();

//        access non-static class
        animal.deer deer= a.new deer();
        deer.type();



    }
}
