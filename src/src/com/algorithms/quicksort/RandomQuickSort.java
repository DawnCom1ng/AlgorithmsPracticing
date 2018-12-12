package com.algorithms.quicksort;

public class RandomQuickSort {
    public static void quickSort(int[] arr, int L, int R) {
        if (L < R) {
            swap(arr, L + (int) (Math.random() * (R - L + 1)), R);
            int[] p = partition(arr, L, R);
            quickSort(arr, L, p[0] - 1);
            quickSort(arr, p[1] + 1, R);
        }
    }

    public static int[] partition(int[] arr, int L, int R) {
        int less = L - 1;
        int more = R;
        while(L < more) {
            if (arr[L] < arr[R]){
                swap(arr, L++, ++less);
            } else if (arr[L] > arr[R]) {
                swap(arr, L, --more);
            } else {
                L++;
            }
        }

        swap(arr, R, less+1);
        return new int[] {less+1, more};
    }

    public static void swap(int[] arr, int L, int R) {
        int tmp = arr[L];
        arr[L] = arr[R];
        arr[R] = tmp;

    }

    public static void main(String[] args) {
        int[] arr = {3,55,5,11,2,6,5};
        quickSort(arr, 0, 6);
        for (int a:arr) {
            System.out.print(a + " ");
        }

    }
}
