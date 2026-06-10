package CRT;

import java.util.Scanner;
class ticketCost {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of ticket: ");
        int n = sc.nextInt();

        if (n < 5 || n > 40) {
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
            return;
        }

        System.out.print("Do you want refreshment: ");
        char refreshment = sc.next().charAt(0);

        System.out.print("Do you have coupon code: ");
        char coupon = sc.next().charAt(0);

        System.out.print("Enter the circle: ");
        char circle = sc.next().charAt(0);

        double cost;

        if (circle == 'k') {
            cost = n * 75;
        } else if (circle == 'q') {
            cost = n * 150;
        } else {
            System.out.println("Invalid Input");
            return;
        }

        if (n > 20) {
            cost -= cost * 0.10;
        }

        if (coupon == 'y') {
            cost -= cost * 0.02;
        }

        if (refreshment == 'y') {
            cost += n * 50;
        }

        System.out.printf("Ticket cost: %.2f", cost);
    }
}