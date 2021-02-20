package dev.alexanderbell;

public class LeetCodeSubtractProdAndSumOfDigits {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(705));
    }

    public static int subtractProductAndSum(int n) {
        int sum = 0, product = 1;
        while (n > 0){
            sum += n % 10;
            product = product * (n%10);
            n = n/10;
        }
        return product - sum;
    }
}
