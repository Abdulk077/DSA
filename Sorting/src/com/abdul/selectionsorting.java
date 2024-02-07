package com.abdul;
import java.util.Arrays;


public class selectionsorting {
    public static void main(String[] args) {
        int[] arr = new int[]{7,2,6,4,};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionsort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - (i + 1);
            int maxindex = maxint(arr, 0, last);
            swap(arr, maxindex, last);
        }
    }
    static int maxint(int[] arr, int start, int end){

            int max = start ;
            for (int i = 0; i <= end; i++) {
                if(arr[max] < arr[i]){
                    max = i;
                }
            }
            return max;

    }
    static void swap(int[] arr, int start , int end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end ] = temp;


    }

}
