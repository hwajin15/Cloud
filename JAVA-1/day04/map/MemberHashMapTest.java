package map;

import java.util.HashMap;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap manager = new MemberHashMap();

        Member memberlee = new Member(100,"lee");
        Member memberkim = new Member(200,"kim");
        Member memberpark = new Member(300,"park");

        manager.addMember(memberlee);
        manager.addMember(memberkim);
        manager.addMember(memberpark);

        manager.showMember();

        manager.removeMember(200);
        manager.showMember();
        manager.removeMember(20);
        manager.showMember();

    }
}
