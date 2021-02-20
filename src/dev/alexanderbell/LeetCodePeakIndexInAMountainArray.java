package dev.alexanderbell;

public class LeetCodePeakIndexInAMountainArray {
    public static void main(String[] args) {

    }

    public static int peakIndexInMountainArray(int[] arr) {
        int indexOfGreatest = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                indexOfGreatest = i;
            }
        }
        return indexOfGreatest;
    }
}
