package com.example;

// import the Arrays library here
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[] unsortedArray = {'y', 'e', 'e', 'p', 'w', 'c', '>', '3'};
        // sort the array and output it to the console
        Arrays.sort(unsortedArray);

        for(char items : unsortedArray){
            System.out.println(items + " ");
        }
    }
}