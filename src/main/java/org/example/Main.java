package org.example;

import java.util.Objects;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("가로 길이 입력: ");
        int n = sc.nextInt();
        System.out.print("세로 길이 입력: ");
        int m = sc.nextInt();
        System.out.print("+");
        for(int i = 1; i <= n-2; i++)
            System.out.print("-");
        System.out.println("+");
        for(int j = 1; j <= m-2; j++) {
            System.out.print("|");
            for (int k = 1; k <= n - 2; k++)
                System.out.print(" ");
            System.out.println("|");
        }
        System.out.print("+");
        for(int i = 1; i <= n-2; i++)
            System.out.print("-");
        System.out.println("+");
    }
}


