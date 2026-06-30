package Exception_Handling;

import java.util.Scanner;



public class launchEH2 {
    public static void main(String[] args) {
        System.out.println("Connection -Eastablish");
        try {


            Scanner sc = new Scanner(System.in);
            System.out.println("kindly enter the Numerator for devision");
            int n = sc.nextInt();

            System.out.println("enter the value of Denominator for  Division");
            int d = sc.nextInt();

            int res = n / d;
            System.out.println("Result " + res);

            System.out.println("Enter the size of array");
            int size = sc.nextInt();

            int arr[] = new int[size];

            System.out.println("enter the element");
            int ele = sc.nextInt();

            System.out.println("Enter the pos at which element to be inserted");
            int pos = sc.nextInt();

            arr[pos] = ele;
            System.out.println("data is inserted at pos " + pos + " " + arr[pos]);

            System.out.println("entered element inserted in the array");
            }catch(ArithmeticException e) {
                System.out.println("please enter non zero number");
            }

            catch (NegativeArraySizeException e){
                System.out.println("Don't be negative number");
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Array out of bounds");
            }
            catch (Exception e){
                System.out.println("Something went wrong");
            }
                System.out.println("Connection terminated");
    }
}