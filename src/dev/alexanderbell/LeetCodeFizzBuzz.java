package dev.alexanderbell;

import java.util.ArrayList;
import java.util.List;

public class LeetCodeFizzBuzz {
    public static void main(String[] args) {
        System.out.println(  fizzBuzz(15));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> strings = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(i%3 == 0 && i%5==0){
                strings.add("FizzBuzz");
                continue;
            }
            if(i%3 == 0){
                strings.add("Fizz");
                continue;
            }
            if(i%5 == 0){
              strings.add("Buzz");
              continue;
            }
            strings.add(String.valueOf(i));
        }
        return strings;
    }
}
