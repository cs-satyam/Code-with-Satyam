package Lamda_expression.Nestedclasses;

//class A {
//    public void show(){
//        System.out.println("A in show");
//    }
//}
//class B extends A{
//    public void show(){
//        System.out.println("B in show");
//    }
//}

class Person {
    public void printName() {
        System.out.println("Satyam");
    }

    // 1. STATIC Nested Class
    static class StaticPhone {
        public void details() {
            System.out.println("One-plus (Static Class)");
        }
    }

    // 2. NON-STATIC Inner Class
    class NonStaticPhone {
        public void details() {
            System.out.println("One-plus (Non-Static Class)");
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        // Create the outer object
        Person obj = new Person();
        obj.printName();

        // ⚡ 1. Accessing the STATIC nested class
        // No outer instance is needed.
        Person.StaticPhone staticObj = new Person.StaticPhone();
        staticObj.details();

        // 📱 2. Accessing the NON-STATIC inner class
        // It requires the outer object 'obj'.
        Person.NonStaticPhone nonStaticObj = obj.new NonStaticPhone();
        nonStaticObj.details();
    }
}
