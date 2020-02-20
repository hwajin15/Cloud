package com.example.day04;

import com.example.day03.Student;

import java.util.Arrays;

public class SungjukAppv2 {
    public static void main(String[] args) {
//        Student stu1 = new Student("aaa",100,98,78);
//        stu1.cal();
////        stu1.display();

        Student[] students = new Student[]{
                new Student("ZZZ", 100, 98, 95),
                new Student("DDD", 95, 98, 80),
                new Student("CCC", 85, 98, 88),
                new Student("BBB", 100, 75, 78),
                new Student("AAA", 100, 99, 88),
        };
    //각학생의 총점 평균구하기
        for(Student stu:students){
            stu.cal();
        }
        System.out.println("-------- before");
       for (Student stu :students){
           System.out.println(stu);

       }
       //comparator ,comparable
//        Arrays.sort(students, new MyComparator());
        Arrays.sort(students);
        //각 학생의 데이터 출력
        System.out.println("-------- after");
        for (Student stu :students){
            System.out.println(stu); //printls(stu.toString())

    }


}

}
