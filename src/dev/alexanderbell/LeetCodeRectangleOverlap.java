package dev.alexanderbell;

public class LeetCodeRectangleOverlap {
    public static void main(String[] args) {
        System.out.println(isRectangleOverlap(new int[]{0,0,1,1},new int[]{1,0,2,1}));
    }

    public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        if(rec1[2] > rec2[0]  || rec1[3] > rec2[1]) return true;
        return false;
    }
}
