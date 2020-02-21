package com.example.day05;

public class MemberApp {
    public static void main(String[] args) {
        //abstract 는 class 생성x
        GeneralMember member1 = new GeneralMember("user1", "A");
        member1.setPoint(100);
        member1.display();

        VipMember vipMember =new VipMember("user2","S1");
        vipMember.setPoint(100);
        vipMember.display();


        VVipmember vVipmember =new VVipmember("user3");
        vVipmember.setPoint(100);
        vVipmember.display();
    }
}
