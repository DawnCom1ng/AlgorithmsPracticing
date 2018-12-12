package com.algorithms.insertionSort;

public class InsertionSortTry {

    public static void insertionSort(int[] arr) {
        if (arr == null||arr.length<2) {
            return;
        }

        for (int i= 0;i<arr.length;i++) {
            for (int j = i-1;j>=0 && arr[j]>arr[j+1];j--){
                swap(arr, j, j+1);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {3,55,5,11,2,6,5,25,16,6,8,7,5};
        insertionSort(arr);
        for(int element:arr) {
            System.out.print(element+ " ");
        }
    }

}
