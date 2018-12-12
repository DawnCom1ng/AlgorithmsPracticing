package com.algorithms.test;

public class Test0 {


    private static int getMax(int[] arr, int i, int j) {

        if (i == j) {
            return arr[i];
        }

        int mid = (i + j) / 2;
        int maxLeft = getMax(arr, i, mid);
        int maxRight = getMax(arr, mid+1, j);
        return Math.max(maxLeft, maxRight);
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 10, 20 ,4};
        System.out.println(getMax(arr, 1, 4));

    }
}

