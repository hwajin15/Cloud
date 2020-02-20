package com.example.day04;

import com.example.day03.Student;

import java.util.Comparator;

public class MyComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getSum()> s2.getSum()){
            return -1;
        }else if(s1.getSum() < s2.getSum()){
            return 1;
        }else {
            return  s2.getName().compareTo(s1.getName());
        }
}}
