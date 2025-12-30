package com.example;

public class Main {
    public static void main(String[] args) {
        String sentence = "I love programming in Java";
        String result = findLongestWord(sentence);
        System.out.println(result);
    }

    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";
        int longestIndex = -1;

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
                longestIndex = sentence.indexOf(longestWord);
            }
        }

        return "Longest word: \"" + longestWord + "\" at index " + longestIndex;
    }
}