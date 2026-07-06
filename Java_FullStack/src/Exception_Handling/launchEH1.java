package Exception_Handling;

import java.util.Scanner;

public class launchEH1 {
    public  static void main(String args[]){
        System.out.println("Connection -Eastablish");
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("kindly enter the Numerator for devision");
            int n = sc.nextInt();

            System.out.println("enter the value of Denominator for  Division");
            int d = sc.nextInt();

            int res = n / d;
            System.out.println("Result " + res);

        }
        catch(Exception e){
            System.out.println("********************************************");
            System.out.println("Please enter a non zero Denominator  value");
            System.out.println(e.getMessage());
            System.out.println(e.fillInStackTrace());

        }
        System.out.println("Connection terminated");

    }
}
