package dev.alexanderbell;

public class LeetCodeMergeSortedArray {
    public static void main(String[] args) {
        int[] ints = new int[2];
        ints[0] = 2;
        int[] ints1 = {1};
        merge(ints, 1, ints1, 1);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
        int index = nums1.length - 1;

        while (index >= 0) {
            if (m < 0) {
                nums1[index] = nums2[n];
                n--;
            } else if (n < 0) {
                nums1[index] = nums1[m];
                m--;
            } else {
                if (nums1[m] > nums2[n]) {
                    nums1[index] = nums1[m];
                    m--;
                } else {
                    nums1[index] = nums2[n];
                    n--;
                }
            }

            index--;
        }
    }
}
