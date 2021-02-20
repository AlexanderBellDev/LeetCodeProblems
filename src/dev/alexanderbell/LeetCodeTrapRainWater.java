package dev.alexanderbell;

public class LeetCodeTrapRainWater {

    public static void main(String[] args) {
        System.out.println(trapDyn(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }

    public static int trap(int[] height) {
        int vol = 0;
        for (int i = 0; i < height.length - 1; i++) {
            int leftValue = -1;
            int rightValue = -1;
            for (int inner = i; inner >= 0; inner--) {
                if (height[i] < height[inner] && height[inner] > leftValue) {
                    leftValue = height[inner];
                }
            }
            if (leftValue > -1) {
                for (int inner = i; inner < height.length; inner++) {
                    if (height[i] < height[inner] && height[inner] > rightValue) {
                        rightValue = height[inner];
                    }
                }
            }

            if (rightValue > -1) {
                int min = Math.min(leftValue, rightValue);
                vol = vol + (min - height[i]);
            }
        }

        return vol;
    }

    public static int trapDyn(int[] height) {
        int vol = 0;
        int maxL = 0;
        int maxR = 0;
        int pointerL = 0;
        int pointerR = height.length - 1;

        if(height.length == 0) return 0;

        while (pointerL != pointerR) {
            if (height[pointerL] < height[pointerR]) {  //left contains smaller value
                if (maxL > height[pointerL]) {
                    vol = vol + maxL - height[pointerL];
                }
                if (height[pointerL] > maxL) maxL = height[pointerL];
                pointerL++;
            } else if (height[pointerR] < height[pointerL]) {
                if (maxR > height[pointerR]) {
                    vol = vol + maxR - height[pointerR];
                }
                if (height[pointerR] > maxR) maxR = height[pointerR];
                pointerR--;
            }else if (height[pointerR] == height[pointerL]) {
                if (maxL > height[pointerL]) {
                    vol = vol + maxL - height[pointerL];
                }
                if (height[pointerL] > maxL) maxL = height[pointerL];
                pointerL++;
            }
        }

        return vol;
    }
}
