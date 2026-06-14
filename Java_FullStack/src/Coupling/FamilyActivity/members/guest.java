package Coupling.FamilyActivity.members;

import Coupling.FamilyActivity.activities.sleeping;
import Coupling.FamilyActivity.activities.watchingTv;

public class guest implements sleeping, watchingTv {
    @Override
    public void watchingTv() {
        System.out.println("Guest is watchingTv");
    }

    @Override
    public void sleeping() {
        System.out.println("Guest is sleeping");
    }
}
