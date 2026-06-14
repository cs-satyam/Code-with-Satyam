package Coupling.FamilyActivity.members;

import Coupling.FamilyActivity.activities.cooking;
import Coupling.FamilyActivity.activities.sleeping;
import Coupling.FamilyActivity.activities.studying;
import Coupling.FamilyActivity.activities.watchingTv;

public class sister implements studying, cooking, watchingTv , sleeping {
    @Override
    public void cooking() {
        System.out.println("sister is helping Cooking");

    }

    @Override
    public void watchingTv() {
        System.out.println("sisteris Watching Tv");
    }

    @Override
    public void studying() {
        System.out.println("sister is Studying ");

    }

    @Override
    public void sleeping() {
        System.out.println("sister is sleeping");
    }
}
