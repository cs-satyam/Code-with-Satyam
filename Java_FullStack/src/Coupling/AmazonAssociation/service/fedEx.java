package Coupling.AmazonAssociation.service;

public class fedEx implements ideliveryService{
    @Override
    public Boolean deliverProduct(Double amount) {
        System.out.println("delivered product by first flight through FedEx and amount is paid "+amount);
        return true;
    }
}
