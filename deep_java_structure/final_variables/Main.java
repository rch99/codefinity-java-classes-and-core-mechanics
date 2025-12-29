package com.example;

public class Main {
    public static void main(String[] args) {
        // initializing variables
        int a = 9;
        final int b = 15;
        int c = 21;
        int d = -62;
        final int e = 0;
        
        // performing mathematical operations on the variables
        c = c + 9;
        d = d - 8;
        a = a + 1;
        int result = a + b + c + d + e;
        
        // displaying the result
        System.out.println(result);
    }
}