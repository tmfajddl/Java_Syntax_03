package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 : ");
        int n = sc.nextInt();
        for(int i = n; i >= 1; i--) {
            for (int k = 1; k <= i - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++)
                System.out.print("*");
            System.out.println("");
        }
    }
}

