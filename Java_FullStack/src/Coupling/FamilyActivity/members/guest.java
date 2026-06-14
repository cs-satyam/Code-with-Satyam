package Coupling.FamilyActivity.members;

import Coupling.FamilyActivity.home.familymember;

public class guest implements familymember {

    @Override
    public void introduce() {
        System.out.println("I am Guest");
    }

    public void sleeping() {
        System.out.println("Guest is sleeping");
    }

    public void watchingTv() {
        System.out.println("Guest is watching TV");
    }

}