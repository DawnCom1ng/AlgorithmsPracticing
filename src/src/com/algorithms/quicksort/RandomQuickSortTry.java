package com.algorithms.quicksort;

public class RandomQuickSortTry {


    public static void randomQuickSort(int[] arr) {
        if (arr==null||arr.length<2) {
            return;
        }

        randomQuickSort(arr, 0, arr.length-1);
    }

    public static void randomQuickSort(int[] arr, int l, int r) {
        if (l>=r) {
            return;
        }

        swap(arr, l + (int) Math.random() * (r-l+1), r);

        int less = l-1;
        int more = r;
        int cur = l;

        while(cur<more) {
            if(arr[cur]<arr[r]){
                swap(arr, cur++, ++less);
            } else if (arr[cur] > arr[r]) {
                swap(arr, cur, --more);
            } else {
                cur++;
            }
        }

        swap(arr, more, r);

        randomQuickSort(arr, l, less);
        randomQuickSort(arr, more+1,r);

    }


    public static void swap (int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


    public static void main (String[] args) {
        int[] arr = {3,55,5,11,2,6,5,25,16};
        randomQuickSort(arr);
        for (int element:arr) {
            System.out.print(element + " ");
        }
    }
}
