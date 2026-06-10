package Coupling.AmazonAssociation.main;

import Coupling.AmazonAssociation.service.blueDart;
import Coupling.AmazonAssociation.service.fedEx;

// Inversion of Control  ==>   IoC     Hollywood Principle: “Don't call us, we'll call you."
import Coupling.AmazonAssociation.service.firstFlight;

public class launchAmazon {
    public static void main(String[] args) {

//        dependency injection ==> injecting the dependent object to target class
//        if I do the injection by constructor that is called  constructor injection
//        if setter I will then it is called setter injection
//        constructor injection ==> dependent object to the  target class through the constructor
//        now we do not create this  "amazon amz = new amazon( new firstFlight() )" its all taken care by spring framework;
//        spring framework    internally do the  constructor injection we not need to target object and dependent object

//        Yes, you are exactly right. With Spring's constructor injection,
//        you do not need to manually create or link the target object and
//        the dependent object. Spring's IoC container handles everything automatically.
//        How It Works Automatically
//            You only need to do two things:
//                      Mark both classes as Spring beans.
//                      Provide a constructor in the target class.

        amazon amz = new amazon( new firstFlight() );

//        fedEx fed = new fedEx();
//        amz.setService(fed);

//         Setter injection
//        amz.setService(new fedEx());
//        amz.setService(new blueDart());
//        amz.setService(new firstFlight());

        Boolean status = amz.deliverTheProduct(452.6);
        if (status) {
            System.out.println("Product delivered successfully");
            System.out.println(status);
        }else{
            System.out.println("Failed to deliver the product");
        }

    }
}
