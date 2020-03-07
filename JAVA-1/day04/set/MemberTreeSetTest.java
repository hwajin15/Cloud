package set;

import generic.MemberHashSET;

public class MemberTreeSetTest {

    public static void main(String[] args) {
        MemberTreeSET manager = new MemberTreeSET();
        Member memberlee = new Member(100, "lee");
        Member memberkim = new Member(200, "kim");
        Member memberpark = new Member(300, "park");
        Member memberpark2 = new Member(300, "park2");

        manager.addMember(memberkim);
        manager.addMember(memberlee);
        manager.addMember(memberpark);
        manager.addMember(memberpark2);

        manager.showMemberInfo();
        manager.removeMember(100);
        manager.showMemberInfo();
    }

}
