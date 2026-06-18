package Lamda_expression.Realtime;

import java.util.concurrent.CompletableFuture;

public class AsyncPayment {
    public static void main(String[] args) {
        System.out.println("User clicks 'Pay Now'...");

        // Async execution simplified with a lambda
        CompletableFuture.runAsync(() -> {
            // This runs safely in the background
            System.out.println("Connecting to Bank API on: " + Thread.currentThread().getName());
            chargeCard();
        });

        System.out.println("Main UI remains responsive!");

        // Keep main thread alive for demo
        try { Thread.sleep(2000); } catch (Exception e) {}
    }

    private static void chargeCard() {
        System.out.println("Payment successful!");
    }
}
