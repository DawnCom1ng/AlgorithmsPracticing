package com.algorithms.mergesort;

public class MergeSort {

    public static void mergeSort(int[] arr) {
        if (arr==null||arr.length<2) {
            return;
        }

        mergeSort(arr, 0, arr.length-1);
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l == r) {
            return;
        }

        int mid = l + (r-1)>>1;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l, mid, r);
    }

    public static void merge(int[] arr, int l, int m, int r) {
        int p1 = l;
        int p2 = m + 1;
        int[] helparr = new int[r-l+1];
        int i = 0;

        while(p1<=m && p2<=r) {
            helparr[i++] = arr[p1]<=arr[p2] ? arr[p1++] : arr[p2++];
        }

        while (p1<=m) {
            helparr[i++] = arr[p1++];
        }

        while (p2<=r) {
            helparr[i++] = arr[p2++];
        }

        for (int j = 0;j<helparr.length;j++) {
            arr[l+j] = helparr[j];
        }
    }

    public static void main (String[] args) {
        int[] arr = {4,5,1,2,3,5,9,22,10,9};
        mergeSort(arr);
        for (int element:arr) {
            System.out.print(element);
        }
        mergeSort(arr,0, arr.length-1);
        System.out.println();
        for (int element:arr) {
            System.out.print(element);
        }
    }

}
