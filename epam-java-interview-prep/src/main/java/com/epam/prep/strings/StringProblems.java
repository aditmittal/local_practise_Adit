package com.epam.prep.strings;

import java.util.HashMap;
import java.util.Map;

public class StringProblems {

    // Palindrome
    public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    // Reverse String
    public static String reverseString(String str) {

        char[] chars = str.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {

            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }

    // Character Frequency
    public static Map<Character, Integer> characterFrequency(String str) {

        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch : str.toCharArray()) {

            frequencyMap.put(
                    ch,
                    frequencyMap.getOrDefault(ch, 0) + 1
            );
        }

        return frequencyMap;
    }

    // Anagram Check
    public static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str2.toCharArray()) {

            if (!map.containsKey(ch)) {
                return false;
            }

            map.put(ch, map.get(ch) - 1);

            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }

        return map.isEmpty();
    }
}
