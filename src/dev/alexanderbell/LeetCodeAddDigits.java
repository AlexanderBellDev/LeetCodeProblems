package dev.alexanderbell;

public class LeetCodeAddDigits {

    public static int addDigits(int num) {
        int sum = 0;
        String s = "" + num;
        String[] split = s.split("");
        for (String number : split) {
            sum += Integer.parseInt(number);
        }
        if(sum < 10) return sum;

        return addDigits(sum);
    }

    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }

}
