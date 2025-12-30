package com.example;

public class Main {
    static int findMax(int[] array) {
        int max = array[0];
        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    static int findMin(int[] array) {
        int min = array[0];
        for (int number : array) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] numbers = {10, -3, 25, 7, 99, -50, 0, 12};

        int max = findMax(numbers);
        int min = findMin(numbers);

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}