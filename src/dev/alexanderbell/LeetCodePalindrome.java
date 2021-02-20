package dev.alexanderbell;

public class LeetCodePalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindromeSecondAttempt("race a car"));
    }

    public static boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() -1;
        while (l<r){
            if(!Character.isLetterOrDigit(s.charAt(l))){
                l++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(r))){
                r--;
                continue;
            }
            if(Character.toUpperCase(s.charAt(l))!=(Character.toUpperCase(s.charAt(r)))){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static boolean isPalindromeSecondAttempt(String s){
        int l = 0, r = s.length()-1;
        while (l<r){
            if(!Character.isLetterOrDigit(s.charAt(l))){
                l++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(r))){
                r--;
                continue;
            }

                if(Character.toUpperCase(s.charAt(l)) != Character.toUpperCase(s.charAt(r))) return false;
                l++;
                r--;
            }
        return true;
    }
}
