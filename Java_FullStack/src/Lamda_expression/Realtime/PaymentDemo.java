package Lamda_expression.Realtime;


@FunctionalInterface
interface PaymentMethod {
    void pay(double amount);
}

public class PaymentDemo {

    public static void processTransaction(double amount, PaymentMethod method) {
        method.pay(amount);
    }



    public static void main(String[] args) {
        // Define payment logic inline
        PaymentMethod upi = amt -> System.out.println("Paid ₹" + amt + " via UPI");
        PaymentMethod card = amt -> System.out.println("Paid ₹" + amt + " via Card");

        // Execute transactions
        processTransaction(1500.00, upi);
        processTransaction(4500.50, card);
    }


}
