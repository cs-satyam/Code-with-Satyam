package Coupling.FamilyActivity.members;

import Coupling.FamilyActivity.home.familymember;

public class brother implements familymember {

    @Override
    public void introduce() {
        System.out.println("I am Brother");
    }

    public void studying() {
        System.out.println("Brother is studying");
    }

    public void sleeping() {
        System.out.println("Brother is sleeping");
    }

    public void watchingTv() {
        System.out.println("Brother is watching TV");
    }
    public void earn() {
        System.out.println("Brother is earning");
    }

}