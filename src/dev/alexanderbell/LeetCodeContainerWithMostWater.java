package dev.alexanderbell;

public class LeetCodeContainerWithMostWater {
    public static int maxArea(int[] height) {
        //Bruteforce find max area of each element
//        int maxVol = 0;
//        int diff;
//        for (int left = 0; left < height.length; left++) {
//            diff = 1;
//            for (int right = left+1; right < height.length; right++) {
//                if(Math.min(height[left],height[right]) * right-left > maxVol){
//                    maxVol = Math.min(height[left],height[right]) * diff;
//                }
//                diff++;
//            }
//        }

        int maxVol = 0;
        int minIndex = 0;
        int maxIndex = height.length-1;

        while (minIndex != maxIndex){
            if(height[minIndex] < height[maxIndex]){
                int i = height[minIndex] * (maxIndex - minIndex);
                if(i>maxVol) maxVol = i;
                minIndex ++;
            }else {
                int i = height[maxIndex] * (maxIndex - minIndex);
                if(i>maxVol) maxVol = i;
                maxIndex --;
            }
        }

        return maxVol;

    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
//        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
