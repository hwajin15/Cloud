package com.example.day04;

import java.util.Calendar;

public class Calculator {



    int add(int x, int y){
        return x + y;}
    double add(double x, double y){
        return x + y ;

    }
    int sub(int x, int y ){
        return  x - y;
    }
    int muti(int x, int y){
        return x * y;
    }
    int divide(int x, int y){
        return  x / y;
    }

    int add(int...values) {
        int result =0;
        for(int value: values)
            result += value;
        return result;
    }
}
