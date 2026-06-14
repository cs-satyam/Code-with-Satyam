package Coupling.FamilyActivity.home;

import java.util.List;

public class myhome implements home {

    private List<familymember> members;

    public myhome(List<familymember> members) {
        this.members = members;
    }

    @Override
    public void showMembers() {

        for (familymember member : members) {
            member.introduce();
        }
    }
}