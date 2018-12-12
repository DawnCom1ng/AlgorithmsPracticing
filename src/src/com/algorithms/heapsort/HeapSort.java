package com.algorithms.heapsort;

public class HeapSort {
    public static void heapInsert(int[] arr, int index) {
        while(arr[index] > arr[(index-1)/2]) {
            swap(arr, index, (index-1)/2);
            index = (index-1)/2;
        }
    }

    public static void heapIfy(int[] arr, int index, int heapsize) {
        int left = 2*index + 1;
        while (left < heapsize) {
            int largest = left+1 < heapsize && arr[left] < arr[left+1] ? left + 1 : left;
            largest = arr[largest] > arr[index] ? largest : index;
            if (index == largest) {
                break;
            }
            swap(arr, index, largest);
            index = largest;
            left = 2 * index + 1;
        }


    }

    public static void heapSort(int[] arr) {
        if(arr == null||arr.length<2) {
            return;
        }

        for (int i = 0;i<arr.length;i++) {
            heapInsert(arr, i);
        }

        for (int i = arr.length;i>1;i--) {
            swap(arr,0, i-1);
            heapIfy(arr, 0, i-1);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;

    }


    public static void main(String[] args) {
        int[] arr = {5, 9, 6, 5, 4, 2, 100, 1, 20, 11, 8};
        heapSort(arr);
        for (int a:arr) {
            System.out.print(a + " ");
        }
    }
}
