package com.algorithms.example;


public class RotateRightAngle {

    public static void rotateAngle(int[][] matrix, int[] start, int[] over) {
          while(start[0]<over[0]){
              rotate(matrix, start, over);
              start[0]++;
              start[1]++;
              over[0]--;
              over[1]--;
          }
    }

    public static void rotate(int[][] matrix, int[] start, int[] over) {



        int sub = over[1]-start[1];
        int[] tmp = new int[sub];
        for(int i = 0;i<sub;i++) {
            tmp[i] = matrix[start[0]][start[1]+i];
        }


        for (int i = 0;i<sub;i++) {
            matrix[start[0]][start[1]+i] = matrix[over[0]-i][start[1]];
        }
        for (int i = 0;i<sub;i++) {
            matrix[over[0]-i][start[1]] = matrix[over[0]][over[1]-i];
        }
        for (int i = 0;i<sub;i++) {
            matrix[over[0]][over[1]-i] = matrix[start[0]+i][over[1]];
        }
        for (int i = 0;i<sub;i++) {
            matrix[start[0]+i][over[1]] = tmp[i];
        }
    }

    public static int[][] createMatrix(int i, int size) {
        int[][] matrix = new int[size][size];
        for (int n = 0;n<size;n++) {
            for (int m = 0;m<size;m++){
                matrix[n][m] = i++;
            }
        }
        return matrix;
    }






    public static void main(String[] args) {

        int[][] matrix = createMatrix(5,5);



        int[] s = {0,0};
        int[] d = {4,4};

        rotateAngle(matrix, s, d);

        for (int[] x : matrix){
            for (int element:x) {
                System.out.print(element + " ");
            }
            System.out.print("\n");

        }

    }

}
