package Lamda_expression.Functional_nterface;

//      Instead of writing separate static or non-static classes
//       for every animal type, lambda expressions treat behavior as data.
//      You pass the logic () -> System.out.println(...) directly into
//       a variable without the overhead of creating class blueprints
//       in the main public main class itself





// 1. The Functional Interface (The foundation for Lambda)
@FunctionalInterface
interface Animal {
    void type();
}

public class Demo3 {
    public static void main(String[] args) {

        // 2. Lambda replacing the 'dog' class concept
        Animal dog = () -> System.out.println("Dog is eating fish");

        // 3. Lambda replacing the 'deer' class concept
        Animal deer = () -> System.out.println("Deer is eating grass");

        Animal man = () -> System.out.println("man is eating fish and fruit");

        // Execute the behavior
        dog.type();
        deer.type();
        man.type();
    }
}
