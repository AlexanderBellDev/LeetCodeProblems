package dev.alexanderbell;

public class LeetCodePalindrome2 {
    public static void main(String[] args) {
        System.out.println(validPalindrome("abc"));
    }

    public static boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length() -1;
        while (l<r){
            if(s.charAt(l)!=(s.charAt(r))){
                if(isPalindromeSecond(s.substring(0, l) + s.substring(l+1))){
                    return true;
                }else {
                    return isPalindromeSecond(s.substring(0, r) + s.substring(r+1));
                }
            }
            l++;
            r--;
        }
        return true;
    }

    public static boolean isPalindromeSecond(String s) {
        int l = 0;
        int r = s.length() -1;
        while (l<r){
            if(s.charAt(l)!=(s.charAt(r))){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
