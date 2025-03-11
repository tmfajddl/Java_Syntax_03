package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        boolean result = Math.isPrimeNumber(1);
        System.out.println("1은(는) 소수인가? : " + result);

        result = Math.isPrimeNumber(2);
        System.out.println("2은(는) 소수인가? : " + result);

        result = Math.isPrimeNumber(3);
        System.out.println("3은(는) 소수인가? : " + result);

        result = Math.isPrimeNumber(4);
        System.out.println("4은(는) 소수인가? : " + result);
        int rs = Math.one_to_n_prime_numbers_count(10);
        System.out.println("rs : " + rs);
        // rs : 4
        rs = Math.one_to_n_prime_numbers_count(13);
        System.out.println("rs : " + rs);
        // rs :  6


        }
    }

    class Math {
        static boolean isPrimeNumber(int num) {
            if (num == 1)
                return false;
            else {
                for (int i = 2; i < num; i++) {
                    if(num % i == 0)
                        return false;
                }
                return true;
            }
        }
        static int one_to_n_prime_numbers_count(int num) {
            int sum = 0;
            for (int i = 1; i <= num; i++) {
                if (isPrimeNumber(i) == true)
                    sum++;
            }
            return sum;
        }
    }

