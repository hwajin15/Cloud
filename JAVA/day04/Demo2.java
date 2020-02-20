package com.example.day04;

import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        String[] names = {"A", "B", "C", "Z", "E"};
        System.out.println("##BEFORE");
        for (String name : names) {
            System.out.println(name);
        }
        Arrays.sort(names);
        System.out.println("##AFTER");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
