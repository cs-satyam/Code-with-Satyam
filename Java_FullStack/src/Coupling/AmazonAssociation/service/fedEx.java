package Coupling.AmazonAssociation.service;

public class fedEx implements ideliveryService{
    @Override
    public Boolean deliverProduct(Double amount) {
        System.out.println("delivered product  through FedEx and amount is paid "+amount);
        return true;
    }
}
