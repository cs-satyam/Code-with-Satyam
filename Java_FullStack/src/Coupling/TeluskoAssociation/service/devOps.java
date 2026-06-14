package Coupling.TeluskoAssociation.service;

public class devOps implements Icourse{
    @Override
    public Boolean getTheCourse(Double amount) {
        System.out.println("DevOps course purchased and the price paid is "+amount) ;
        return true;
    }
}
