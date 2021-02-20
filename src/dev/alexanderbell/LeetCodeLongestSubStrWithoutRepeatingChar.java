package dev.alexanderbell;

import java.util.HashMap;
import java.util.Map;

public class LeetCodeLongestSubStrWithoutRepeatingChar {


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcbcga"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() < 1) return 0;
        if (s.length() == 1) return 1;

        int l;
        int r = 0;
        int maxSize = 0;
        Map<String,Integer> stringHashset = new HashMap<>();

        String[] split = s.split("");
        stringHashset.put(split[0],0);
        while (r <= split.length - 1) {
            if(r+1 > split.length-1){
                break;
            }
            if (!stringHashset.containsKey(split[r+1])) {
                stringHashset.put(split[r+1],r+1);
                r++;
            } else {
                l=stringHashset.get(split[r+1]) + 1;
                r=l;
                stringHashset.clear();
                stringHashset.put(split[l],l);
            }
            if (stringHashset.size() > maxSize) maxSize = stringHashset.size();
        }

        return maxSize;


//        if(s.length() <1) return 0;
//        int maxSize = 0;
//        int currentSize;
//        Set<String> stringHashset = new HashSet<>();
//        String[] split = s.split("");
//        for (int left = 0; left < split.length; left++) {
//            currentSize = 0;
//            stringHashset.clear();
//            for (int right = left; right < split.length; right++) {
//                if (!stringHashset.contains(split[right])) {
//                    stringHashset.add(split[right]);
//                    currentSize++;
//                    if (currentSize > maxSize) maxSize = currentSize;
//                } else {
//                    break;
//                }
//            }
//        }
//
//
//        return maxSize;
    }

}
