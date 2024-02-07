package com.abdul;

import java.util.Arrays;



public class Bubblesorting {
    public static void main(String[] args) {
        int[] arr = new int[]{1,4,5,2,6,};
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int[] arr){
        boolean swapped;

        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - 1; j++) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }


            }
            if(!swapped){
                break;
            }

        }

    }
}
