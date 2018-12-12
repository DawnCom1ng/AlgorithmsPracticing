package com.algorithms.quicksort;

public class QuickSortTry {

    public static void quickSort(int[] arr) {
        if (arr==null||arr.length<2) {
            return;
        }

        quickSort(arr, 0, arr.length-1);

    }

    public static void quickSort(int[] arr, int l, int r) {
        if (l>=r) {
            return;
        }


        int less = l - 1;
        int more = r;
        int cur = l;

        while (cur < more) {
            if (arr[cur]<arr[r]) {
                swap(arr, cur++, ++less);
            } else if (arr[cur]>arr[r]) {
                swap(arr, cur, --more);
            } else {
                cur++;
            }
        }

        swap(arr, more, r);


        quickSort(arr, l, less);
        quickSort(arr, more+1,r);

    }

    public static void swap (int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {3,55,5,11,2,6,5,25,16};
        quickSort(arr);
        for (int element:arr) {
            System.out.print(element + " ");
        }
    }
}
