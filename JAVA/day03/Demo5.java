package com.example.day02;

public class Demo5 {

    public static void main(String[] args) {
        Member member = new Member("java",20);
        Member member1 =new Member("c++", 15);
        Member member2 =new Member("Python");
        Member member3 =new Member(17);
        member.displayInfo();
        member1.displayInfo();
        member2.displayInfo();
        member3.displayInfo();
    }
}
