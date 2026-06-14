package Coupling.FamilyActivity.home;

import Coupling.FamilyActivity.members.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        brother brotherObj = new brother();
         sister sisterObj=new sister();

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

        sisterObj.introduce();
        sisterObj.studying();
        sisterObj.sleeping();
        sisterObj.watchingTv();
        sisterObj.cooking();
    }
}