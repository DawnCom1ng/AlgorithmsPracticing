package com.algorithms.quicksort;

public class QuickSort {
    public static void quickSort(int[] arr, int L, int R) {
        if (L < R) {
            int[] p = partition(arr, L, R);
            quickSort(arr, L, p[0]-1);
            quickSort(arr,p[1]+1, R);
        }
    }

    public static int[] partition(int[] arr, int L, int R) {
        int less = L - 1;
        int more = R;
        while(L<more) {
            if (arr[L]<arr[R]) {
                swap(arr, ++less, L++);
            } else if (arr[L]>arr[R]) {
                swap(arr, --more, L);
            } else {
                L++;
            }
        }
        swap(arr, more, R);
        return new int[] {less+1, more};
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {3,55,5,11,2,6,5};
        quickSort(arr, 0, 6);
        for (int a:arr) {
            System.out.print(a + " ");
        }
    }
}
