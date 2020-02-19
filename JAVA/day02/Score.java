package com.example.day02;

import java.util.Arrays;
import java.util.Collections;

public class Score {
    public static void main(String[] args) {
        String[] names ={"정서화1","정서화2","정서화3","정서화4","정서화5"};
        int[] kors ={100,90,90,90,90};
        int[] engs ={100,90,80,80,80};
        int[] mat  ={100,98,80,99,70};
        Integer [] avg = new Integer[5];
        for(int i= 0; i<names.length; i++){
            avg[i] = (kors[i] + engs[i] + mat[i]) /3;
            System.out.println(names[i] +":"+ avg [i]);
            Collections.reverse(Collections.singletonList(avg));
//            Arrays.sort(avg ,Collections.reverseOrder());
        }
    }
}
