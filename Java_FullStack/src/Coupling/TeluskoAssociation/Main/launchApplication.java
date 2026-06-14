package Coupling.TeluskoAssociation.Main;

import Coupling.TeluskoAssociation.service.java;
import Coupling.TeluskoAssociation.service.springBoot;

public class launchApplication {
    public static void main(String[] args) {
//        constructor injection
        Telusko telusko = new Telusko(new springBoot());

//        setter injection
        telusko.setCourse(new java());


//        return the amount status
        Boolean status=telusko.buyTheCourse(798.58);

//        print the output
        if(status==true){
            System.out.println("Course purchased successfully");
        }else {
            System.out.println(" Purchased not successful !!  Course is not open ");
        }

    }
}
