package com.algorithms.netherlandsflag;

public class NetherlandsFlag {
    public static int[] partition(int[] arr, int L, int R, int num) {
        int less = L - 1;
        int more = R + 1;
        int cur = L;
        while (cur < more) {
            /*if - else if - else 的语句形式可以保证一次只会有一个模块进行运行
              而if - if - if下当arr[cur] == num的情况下cur++,导致其他判断语句依然生效。
              应避免判断后对判断条件的变量进行改变
            if (arr[cur] < num) {
                swap(arr, cur, less+1);
                less++;
                cur++;
            }

            if (arr[cur] > num) {
                swap(arr, cur, more-1);
                more--;
            }

            if (arr[cur] == num) {
                cur++;
            }*/

            if (arr[cur] < num) {
                swap(arr, ++less, cur++);
            } else if (arr[cur] > num) {
                swap(arr, --more, cur);
            } else {
                cur++;
            }
        }

        return arr;
    }


    public static void swap (int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {3,55,5,11,2,6,5};
        int num = 6;
        int[] arrl = partition(arr, 0, 6, num);
        for (int a:arrl) {
            System.out.print(a + " ");
        }
    }
}
