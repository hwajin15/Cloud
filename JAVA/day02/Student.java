package com.example.day02;

public class Student {
    String name;
    int kor;
    int math;
    int eng;
    int sum;
    float avg;

    Student(String name, int kor, int math, int eng){
        this.name =name;
        this.kor =kor;
        this.math=math;
        this.eng = eng;
    }

    void cal(){
        this.sum =this.kor + this.math +this.eng;
        this.avg = this.sum /3.0f;

    }
    void  display(){
        System.out.println(String.format("%s의 총점은: %s, 평균:%.2f", this.name,this.sum,this.avg));
    }
}
