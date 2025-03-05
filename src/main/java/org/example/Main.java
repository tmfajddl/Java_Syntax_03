package org.example;

import java.util.Scanner;

// 문제 : 아래와 같이 출력해주세요.
// 문제 : 단을 * 1000까지 출력해주세요.

class Main {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while(i<=5) {
            sum += i;
        i++;
        }
        System.out.println(sum);
    }
}
