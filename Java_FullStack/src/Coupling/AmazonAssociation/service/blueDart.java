package Coupling.AmazonAssociation.service;

public class blueDart implements ideliveryService {
    @Override
    public Boolean deliverProduct(Double amount) {
        System.out.println("delivered product  through BlueDart and amount is paid "+amount);
        return true;
    }
}
