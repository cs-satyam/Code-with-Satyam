package Coupling.TeluskoAssociation.service;

public class java implements Icourse
{
    @Override
    public Boolean getTheCourse(Double amount) {
        System.out.println("Java course purchased and the price paid is "+amount) ;

        return true;
    }
}
