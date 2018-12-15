package com.algorithms.bucketsort;

public class MaxSubtraction {

    private static int maxSubtraction(int[] arr) {
        int len = arr.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0;i<len;i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        if (max == min) {
            return 0;
        }

        int[] minBucket = new int[len+1];
        int[] maxBucket = new int[len+1];
        boolean[] hasNums = new boolean[len+1];
        int bid = 0;
        for (int n = 0;n < len;n++){
            bid = bucket(min , arr[n], len, max);
            minBucket[bid] = hasNums[bid] ? Math.min(arr[n],minBucket[bid]) : arr[n];
            maxBucket[bid] = hasNums[bid] ? Math.max(arr[n],maxBucket[bid]) : arr[n];
            hasNums[bid] = true;
        }

        int res = 0;
        int lastMax = maxBucket[0];

        for (int m = 1;m< len+1;m++) {
            if (hasNums[m]) {
                res = Math.max(minBucket[m]-lastMax,res);
                lastMax = maxBucket[m];
            }
        }
        return res;

    }

    public static int bucket(int min, int num, int len, int max) {
        return (int)(num-min)*len/(max-min);
    }


    public static void main(String[] args) {
        int[] arr = {3,4,6,9,11};
        System.out.println(maxSubtraction(arr));
    }

}
