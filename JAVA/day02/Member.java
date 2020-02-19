package com.example.day02;

public class Member {
    String name;
    int age;
    //overloading -> 같은 클래스에서 메소드의 이름은 같고 , 파라미터의 타입이나 개수가 다름

    Member(String name){
        this.name = name;

    }
    Member(int age){
        this.age = age;

    }

    Member(String name, int age){
        this.name = name;
        this.age = age;
    }

    void displayInfo(){
        System.out.println(name +"/" + age);
        System.out.println(String.format("이름은 %s 이고, 나이는 %s 입니다",name,age));
    }

}
