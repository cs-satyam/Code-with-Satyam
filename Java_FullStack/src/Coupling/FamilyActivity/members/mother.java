package Coupling.FamilyActivity.members;

import Coupling.FamilyActivity.home.familymember;

public class mother implements familymember {

    @Override
    public void introduce() {
        System.out.println("I am Mother");
    }


    public void cooking() {
        System.out.println("Mother is cooking");
    }

    public void sleeping() {
        System.out.println("Mother is sleeping");
    }

    public void watchingTv() {
        System.out.println("Mother is watching TV");
    }

}