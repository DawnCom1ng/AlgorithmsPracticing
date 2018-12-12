package com.algorithms.example;

public class Inversion {

    public static void inversion(int[] arr) {
        if (arr==null||arr.length<2) {
            return;
        }

        inversion(arr, 0, arr.length-1);
    }

    public static void inversion (int[] arr, int l, int r) {
        if (l == r) {
            return;
        }

        int mid = l + (r - l)/2;
        inversion(arr, l, mid);
        inversion(arr, mid+1, r);
        merge(arr, l, mid, r);
    }

    public static void merge (int[] arr, int l, int m, int r) {
        int i = 0;
        int[] arrhelp = new int[r-l+1];
        int p1 = l;
        int p2 = m+1;

        while(p1<=m && p1<=r) {
            if (arr[p1]<arr[p2]){
                for (int n = p2;n<=r;n++) {
                    System.out.println(arr[p1]+" "+arr[n]);
                }
            }
            arrhelp[i++] = arr[p1]<=arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1<=m) {
            arrhelp[i++] = arr[p1++];

        }
        while (p2<=r) {
            arrhelp[i++] = arr[p2++];
        }

        for (int j = 0;j < arrhelp.length;j++) {
            arr[l+j] = arrhelp[j];
        }
    }


    public static void main(String[] args) {
        int[] arr = {4,5,1,6,2,8,11,20,15,60};
        inversion(arr);
    }
}
