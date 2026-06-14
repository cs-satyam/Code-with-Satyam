package Coupling.TeluskoAssociation.service;

public class springBoot implements Icourse{
    @Override
    public Boolean getTheCourse(Double amount) {
        System.out.println("Spring Boot course purchased and the price paid is "+amount) ;
        return true;
    }
}
