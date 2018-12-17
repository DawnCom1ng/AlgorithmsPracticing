package com.algorithms.example;

public class FindNumInMatrix {

    /**
     * 给定一个有N*M的整数矩阵matrix和一个整数K，matrix的每一行和每一列都是排好序的。实现一个函数判断K是否在
     * matrix中。
     */

    public static boolean findNum(int[][] matrix, int k) {
        int a = 0;
        int b = matrix[0].length-1;
        for(int i = 0;i<matrix.length+matrix[0].length-1;i++) {
            if (a<=matrix.length-1 && b>= 0) {
                if (matrix[a][b] > k) {
                    b--;
                } else if (matrix[a][b]<k) {
                    a++;
                } else {
                    return true;
                }
            } else {
                return false;
            }


        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {0,1,2,5},
                {6,8,9,10},
                {12,14,16,17},
                {19,22,26,29}
        };
        if(findNum(matrix,7)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}
