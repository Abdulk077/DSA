package com.abdul.binarysearch;

public class searchingininfinitearray {
    public static void main(String[] args) {
        int[] arr = new int[20];
        arr = new int[]{1, 2, 4, 5, 8};
        int target = 2;
        System.out.println(searchingininfinitearray(arr,target));

    }

    static int searchingininfinitearray(int[] arr, int target) {
        int start = 0;
        int end = 2;
        while (target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start);
            start = temp;
        }
        return searchingininfinitearraya(arr, target);


    }

    static int searchingininfinitearraya(int[] arr, int target) {
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

        return -1;
    }




}
