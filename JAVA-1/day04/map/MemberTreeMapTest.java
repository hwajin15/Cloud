package map;


public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap manager = new MemberTreeMap();

        Member memberlee = new Member(100,"lee");
        Member memberkim = new Member(200,"kim");
        Member memberpark = new Member(300,"park");

        manager.addMember(memberlee);
        manager.addMember(memberkim);
        manager.addMember(memberpark);

        manager.showMember();



    }
}
