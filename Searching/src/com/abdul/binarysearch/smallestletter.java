package com.abdul.binarysearch;

public class smallestletter {
    public void main(String[] args) {
        char[] letters = {'a','b','c','d','e'};
        char target = 'b';
        char ans = smallest(letters,target);
        System.out.println(ans);

    }
    public char smallest(char[] letters ,char target ) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }


        }
        return letters[start % letters.length];
    }

}
