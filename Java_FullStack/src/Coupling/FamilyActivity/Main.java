package Coupling.FamilyActivity;

import Coupling.FamilyActivity.home.familymember;
import Coupling.FamilyActivity.home.myhome;
import Coupling.FamilyActivity.members.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        brother brotherObj = new brother();

        List<familymember> members = List.of(
                new mother(),
                brotherObj,
                new sister(),
                new guest()
        );

        myhome home = new myhome(members);

//        home.showMembers();
//
//        System.out.println();


        brotherObj.introduce();
        brotherObj.earn();
        brotherObj.studying();
        brotherObj.sleeping();
        brotherObj.watchingTv();
    }
}