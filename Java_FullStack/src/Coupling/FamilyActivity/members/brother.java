package Coupling.FamilyActivity.members;


import Coupling.FamilyActivity.activities.earn;
import Coupling.FamilyActivity.activities.sleeping;
import Coupling.FamilyActivity.activities.studying;
import Coupling.FamilyActivity.activities.watchingTv;

public class brother implements  sleeping, studying, watchingTv , earn {

    @Override
    public void sleeping() {
        System.out.println("Brother is sleeping");
    }

    @Override
    public void studying() {
        System.out.println("Brother is studying");
    }


    @Override
    public void earn() {
        System.out.println("Brother is earning");
    }

    @Override
    public void watchingTv() {
        System.out.println("Brother is watching tv");
    }
}