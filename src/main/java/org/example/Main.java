package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("양꼬치 인분 수: ");
        int n = sc.nextInt();
        int k = sc.nextInt();
        if(n>=10)
            k -= n/10;
        int sum = 12000 * n + 2000 * k;
        System.out.printf("음식의 총 합은 %d원입니다.",sum);
    }
}
