package com.example.day02;

public class SungjukApp {
    public static void main(String[] args) {
        Student stu1 = new Student("aaa",100,98,78);
        Student stu2 = new Student("bbb",90,89,69);
        Student stu3 = new Student("ccc",78,98,85);
        stu1.cal();
        stu1.display();
        stu2.cal();
        stu2.display();
        stu3.cal();
        stu3.display();

    }
}
