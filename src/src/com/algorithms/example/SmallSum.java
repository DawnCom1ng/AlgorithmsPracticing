package com.algorithms.example;

public class SmallSum {
    public static int smallSum(int[] arr) {
        if (arr==null||arr.length<2) {
            return 0;
        }

        return smallSum(arr, 0, arr.length-1);
    }


    public static int smallSum(int[] arr, int l, int r) {
        if (r==l) {
            return 0;
        }

        int mid = l + (r-l)/2;
        return smallSum(arr, l, mid) + smallSum(arr, mid+1, r) + merge(arr, l, mid, r);
    }

    public static int merge(int[] arr, int l, int m, int r) {
        int[] arrhelp = new int[r-l+1];
        int i = 0;
        int p1 = l;
        int p2 = m+1;
        int sum = 0;
        while(p1<=m && p2<=r) {
            sum += arr[p1]<arr[p2] ? arr[p1] * (r-p2+1) : 0;
            arrhelp[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1<=m) {
            arrhelp[i++] = arr[p1++];
        }
        while (p2<=r) {
            arrhelp[i++] = arr[p2++];
        }

        for (int j = 0;j<arrhelp.length;j++) {
            arr[l+j] = arrhelp[j];
        }
        return sum;

    }


    public static void main (String[] args) {
        int[] arr= {2,3,6,7,1,5};
        int sum = smallSum(arr);
        for (int element:arr) {
            System.out.print(element + " ");
        }
        System.out.print(sum);
    }
}
