package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;
        int n = 0;

        for (int i = 0; number >= 100 ; i++) {
            answer += number % 100;
            number /= 100;
        }
        answer += number;
        System.out.println(answer);
    }
}
