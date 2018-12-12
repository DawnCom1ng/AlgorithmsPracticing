package com.algorithms.heapsort;

public class HeapSortTry {

    public static void heapSort(int[] arr) {
        if (arr==null||arr.length<2){
            return;
        }

        for(int i = 0;i<arr.length;i++) {
            heapInsert(arr, i);
        }

        int heapsize = arr.length-1;

        while (heapsize>0) {
            swap(arr, 0,heapsize--);
            heapify(arr, 0, heapsize);
        }



    }




    public static void heapInsert (int[] arr, int size) {
        if (size == 0) {
            return;
        }

        while (arr[size]>arr[(size-1)/2]) {
            swap(arr, size, (size-1)/2);
            size = (size-1)/2;;

        }

    }


    public static void heapify (int[] arr, int p, int heapsize) {
        int left = 2*p+1;
        while (heapsize>=left) {
            int largest = left+1<=heapsize && arr[left]<arr[left+1] ? left + 1 : left;
            largest = arr[p]<arr[largest] ? largest : p;
            if (p == largest) {
                break;

            }
            swap(arr, p, largest);
            p = largest;
            left = 2*p+1;

        }

    }


    public static void swap (int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;

    }

    public static void main(String[] args) {
        int[] arr = {3,55,5,11,2,6,5,25,16,6,8,7,5};
        heapSort(arr);
        for(int element:arr) {
            System.out.print(element+ " ");
        }

    }

}
