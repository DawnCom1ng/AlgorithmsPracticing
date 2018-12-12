package com.algorithms.example;

public class RotatePrintMatrix {

    public static void rotatePrint(int[][] matrix, int[] start, int[] over) {


        while (start[0]<=over[0]){
            cirPrint(matrix,start,over);
            start[0]++;
            start[1]++;
            over[0]--;
            over[1]--;
        }

    }

    public static void cirPrint(int[][] matrix, int[] start, int[] over) {


        int a = start[0];
        int b = start[1];


        while(b<over[1]){
            System.out.println(matrix[start[0]][b++]);
        }
        while(a<over[0]){
            System.out.println(matrix[a++][over[1]]);
        }
        while(b>start[1]){
            System.out.println(matrix[over[0]][b--]);
        }
        while(a>start[0]){
            System.out.println(matrix[a--][start[1]]);
        }

    }


    public static void main(String[] args){
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
                {17,18,19,20}
        };
        int[] s = {1,1};
        int[] d = {4,3};

        rotatePrint(matrix, s, d);

    }
}
