package Coupling.FamilyActivity.members;

import Coupling.FamilyActivity.home.familymember;

public class sister implements familymember {

    @Override
    public void introduce() {
        System.out.println("I am Sister");
    }

    public void cooking(){
        System.out.println("Sister is helping in  cooking");
    }

    public void sleeping(){
        System.out.println("Sister is sleeping ");
    }
    public void watchingTv(){
        System.out.println("Sister is WatchingTv");
    }
}