package Coupling.FamilyActivity;

import Coupling.FamilyActivity.home.myhome;
import Coupling.FamilyActivity.members.*;

public class Main {

    public static void main(String[] args) {

        myhome myhome = new myhome(
                new mother(),
                new brother(),
                new sister(),
                new guest()
        );

//        myhome.showMembers();

        brother brother = new brother();

        brother.studying();
        brother.sleeping();
        brother.watchingTv();
    }
}