package Coupling.FamilyActivity.members;

import Coupling.FamilyActivity.activities.cooking;
import Coupling.FamilyActivity.activities.sleeping;
import Coupling.FamilyActivity.activities.watchingTv;

public class mother implements watchingTv , cooking, sleeping{
    @Override
    public void cooking() {
        System.out.println("Mother is cooking");
    }

    @Override
    public void watchingTv() {
        System.out.println("mother is watching");
    }

    @Override
    public void sleeping() {
        System.out.println("mother is sleeping");
    }
}
