package com.example.day02;

public class ArrayExample {
    public static void main(String[] args) {

       // int[][] scores =new int[2][3];
//        int[] scores[] =new int[2][];
//        scores[0] = new int[3];
//        scores[1] = new int[4];
//
//        scores[0][0] =100;
//        scores[0][1] =200;
//        scores[0][2] =300;
//
//        scores[1][0] =400;
//        scores[1][1] =500;
//        scores[1][2] =600;
//        scores[1][3] =700;
    int[][] scores = {{1,2,3},{4,5,6}};
    int [][][] school = {
            {{1,2,3},{4,5,6}},
            {{11,22,33},{4,5,6}},
            {{1,2,3},{4,5,6}}
    };
    for(int i=0; i<scores.length; i++){
        for (int j =0; j<scores[i].length; j++){
            System.out.print(
                    String.format("[%s][%s]=%s\t",i,j,scores[i][j]));
        }
        System.out.println();
    }
        for(int[] row: scores){ //[][] or[][][][]
            for(int value :row){
                System.out.print(value+"\t");
            }
            System.out.println();
        }
    }
}
