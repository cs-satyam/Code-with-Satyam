package Coupling.FamilyActivity.home;

import Coupling.FamilyActivity.members.mother;
import Coupling.FamilyActivity.members.brother;
import Coupling.FamilyActivity.members.sister;
import Coupling.FamilyActivity.members.guest;

public class myhome implements home {

    private mother mother;
    private brother brother;
    private sister sister;
    private guest guest;

    public myhome(
            mother mother,
            brother brother,
            sister sister,
            guest guest) {

        this.mother = mother;
        this.brother = brother;
        this.sister = sister;
        this.guest = guest;
    }

        @Override
        public void showMembers() {
            System.out.println("Mother");
            System.out.println("Brother");
            System.out.println("Sister");
            System.out.println("Guest");
        }
}