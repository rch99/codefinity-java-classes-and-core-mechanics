package com.example;

public class Main {
    static String makeEvenWordsUppercase(String sentence) {
        String[] array = sentence.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                builder.append(array[i].toUpperCase()).append(" ");
            } else {
                builder.append(array[i]).append(" ");
            }
        }
        return builder.toString();
    }

    // do not modify the code below
    public static void main(String[] args) {
        String sentence = "Green hot-dog with cucumber and mustard";
        String result = makeEvenWordsUppercase(sentence);
        System.out.println(result);
    }
    // do not modify the code above
}