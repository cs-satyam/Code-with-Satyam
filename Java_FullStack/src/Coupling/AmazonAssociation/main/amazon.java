package Coupling.AmazonAssociation.main;

import Coupling.AmazonAssociation.service.fedEx;
import Coupling.AmazonAssociation.service.ideliveryService;

// from the prespective of main class the amazon class is target class

// in the current service is using here is call dependent object

public class amazon {

    private ideliveryService service;

    public amazon(ideliveryService service) {
        this.service = service;
    }

    public void setService(ideliveryService service){  // ideliveryService service = new fedEx();
;        this.service=service;
    }
    public amazon (){

    }

    public Boolean deliverTheProduct(Double amount) {

        return service.deliverProduct(amount);

//        tight coupling


//        fedEx fed = new fedEx();
//        return  fed.deliverProduct(amount);


//        Boolean status =fed.deliverProduct(amount);
//        return status;

    }
}
