package com.abdul.binarysearch;

import java.util.Scanner;

public class cellingno {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Scanner in = new Scanner(System.in);

        arr = new int[]{1, 2,  4, 5, 8};
        int target = 5;
        int ans = cellingno(arr,target);
        System.out.print("The index no of the your target no  is  ");
        System.out.print(ans);


    }
     static int cellingno(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;

            }
        }

        return start;
    }


}
