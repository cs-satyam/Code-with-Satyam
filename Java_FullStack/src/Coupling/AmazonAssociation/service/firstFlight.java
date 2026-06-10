package Coupling.AmazonAssociation.service;

public class firstFlight implements ideliveryService {
        @Override
        public Boolean deliverProduct(Double amount) {
            System.out.println("delivered product by first flight  and amount is paid "+amount);
            return true ;
        }
}
