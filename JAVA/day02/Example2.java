package com.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Example2 {
    public static void main(String[] args){
       long startTime =System.currentTimeMillis();
       String str ="A";
       for(int i= 0; i< 1_00_000; i++ ){
           str += "A";
       }
       long endTime = System.currentTimeMillis();
        System.out.print("Elapsed time"+(endTime - startTime));

        startTime =System.currentTimeMillis();
        StringBuilder sb =new StringBuilder("A");
        for(int i= 0; i< 1_000_000; i++ ){
            sb.append("A");
        }
        endTime = System.currentTimeMillis();
        System.out.print("\n(StringBuilder)Elapsed time"+(endTime - startTime));

    }
    }

