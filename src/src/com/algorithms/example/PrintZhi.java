package com.algorithms.example;

public class PrintZhi {

    /**
     * 给定一个矩阵matrix，按照"之"字形的方式打印这个矩阵。
     */

    public static void printZhi(int[][] matrix) {
        int h = matrix.length-1;
        int l = matrix[0].length-1;

        int[] a = {0,0};
        int[] b = {0,0};
        int n = 1;

        for (int i = 0;i<=l+h;i++) {



            if (n > 0) {
                int[] c = {b[0],b[1]};
                /*for (int e:c) {
                    System.out.print(e);
                }*/

                System.out.print(matrix[c[0]][c[1]] + " ");

                while (c[0]!=a[0] && c[1]!=a[1]){
                    //System.out.print(--c[0] + " " + ++c[1]);
                    System.out.print(matrix[--c[0]][++c[1]] + " ");
                }
                //System.out.println();
            } else if (n < 0) {

                int[] c = {a[0],a[1]};
                /*for (int e:c) {
                    System.out.print(e);
                }*/

                System.out.print(matrix[c[0]][c[1]] + " ");

                while (c[0]!=b[0] && c[1]!=b[1]){
                    System.out.print(matrix[++c[0]][--c[1]] + " ");
                }
                //System.out.println();
            }


            if (a[1]<l){
                a[1]++;
            } else if (a[0]<h) {
                a[0]++;
            }
            if (b[0]<h){
                b[0]++;
            } else if (b[1]<l) {
                b[1]++;
            }
            n = -n;


        }

    }


    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4,5,6},
                {7,8,9,10,11,12},
                {13,14,15,16,17,18}
        };
        printZhi(matrix);

    }

}


