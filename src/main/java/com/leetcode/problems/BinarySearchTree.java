package com.leetcode.problems;

public class BinarySearchTree {
    public int getLocation(int[] array, int number) {

        // first half or second half

        return getLocationOfElementUsingBST(array, number, 0, array.length);

    }
    // {0,1,2,3,4,5}
    private int getLocationOfElementUsingBST(int[] array, int number, int start, int end) {
        int middle = ((end-start)/2)+start;
        if(start > end){
            return -1;
        }
        if(number > array[middle]){
            return getLocationOfElementUsingBST(array, number, middle + 1, end);
        }
        else if(number<array[middle]){
            return getLocationOfElementUsingBST(array, number, start, middle);
        }
        else if(number == array[middle]){
            return middle;
        }
        return -1;
    }


}
