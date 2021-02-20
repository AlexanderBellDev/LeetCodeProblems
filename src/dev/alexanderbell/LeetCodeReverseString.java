package dev.alexanderbell;

public class LeetCodeReverseString {
    public static void main(String[] args) {
        reverseString(new char[]{'H','a','n','n','a','h'});
    }
    public static void reverseString(char[] s) {
        int l = 0, r = s.length-1;
        while (l<r){
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}
