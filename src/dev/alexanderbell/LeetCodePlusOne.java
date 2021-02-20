package dev.alexanderbell;

import java.util.Arrays;

public class LeetCodePlusOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1,2,3})));
    }

    public static int[] plusOne(int[] digits) {
        boolean allZero = true;
        for (int digit : digits) {
            if (digit != 0) {
                allZero = false;
                break;
            }
        }
        if (!allZero) {
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                } else {
                    digits[i] = digits[i] + 1;
                    break;
                }
            }

            if (digits[0] == 0) {
                int[] ints = new int[digits.length + 1];
                ints[0] = 1;
                for (int i = 1; i < digits.length; i++) {
                    ints[i] = digits[i];
                }
                return ints;
            }

            return digits;
        }

        digits[digits.length - 1] = 1;
        return digits;
    }
}
