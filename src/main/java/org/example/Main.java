package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int base = 3;
        long result = 1;

        for (int exponent = 4; exponent != 0; --exponent) {
            result = result * base;
        }
       System.out.println("Answer : " + result);
    }
}


