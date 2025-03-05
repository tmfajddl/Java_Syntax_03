package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("가로의 길이를 입력하시오 : ");
        int n = sc.nextInt();
        System.out.print("세로의 길이를 입력하시오 : ");
        int m = sc.nextInt();
        for(int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
