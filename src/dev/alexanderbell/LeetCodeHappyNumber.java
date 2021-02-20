package dev.alexanderbell;

import java.util.HashSet;
import java.util.Set;

public class LeetCodeHappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {
        Set<Integer> seenNumbers = new HashSet<>();
        while (true) {
            int newNumber = 0;
            while (n > 0) {
                newNumber = newNumber + (n % 10) * (n%10);
                n = n / 10;
            }

            if(seenNumbers.contains(newNumber)){
                return false;
            }else {
                seenNumbers.add(newNumber);
            }

            if(Math.abs(newNumber % 10) == 1 && String.valueOf(newNumber).length() == 1){
                return true;
            }
            n = newNumber;
        }
    }
}
