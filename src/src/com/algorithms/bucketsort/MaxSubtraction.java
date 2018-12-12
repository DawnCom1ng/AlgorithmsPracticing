package com.algorithms.bucketsort;

public class MaxSubtraction {

    private static void maxSubtraction(int[] arr) {
        int[] bucket = new int[arr.length+1];
        int max = 0;
        for (int i = 0;i<arr.length;i++) {
            max = Math.max(max, arr[i]);
        }




    }


}
