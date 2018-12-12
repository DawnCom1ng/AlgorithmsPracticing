package com.algorithms.bucketsort;

public class BucketSort {


    private static int[] bucketSort (int[] arr) {

        if (arr==null||arr.length<2){
            return arr;
        }

        int max = 0;
        for(int m = 0;m<arr.length;m++) {
            max = Math.max(max, arr[m]);
        }


        int[] arrbucket = new int[max+1];
        for (int i = 0;i<arr.length;i++) {
            arrbucket[arr[i]]++;
        }

        int i = 0;
        for (int j = 0;j<arrbucket.length;j++) {
            while(arrbucket[j]-- > 0){
                arr[i++] = j;
            }
        }

        /*int n = 0;
        int m = 0;
        while (n<arr.length){
            while (arrbucket[m]!=0) {
                arr[n++] = m;
                arrbucket[m]--;
            }
            m++;
        }*/
        return arrbucket;

    }


    public static void main (String[] args) {
        int[] arr = {4,1,6,7,2,9,3,4,7,5,6,1};
        //int[] arrbucket=bucketSort(arr, 10);
        bucketSort(arr);
        for(int element:arr){
            System.out.print(element+ " ");
        }

    }



}
