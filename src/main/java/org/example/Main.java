package org.example;

import java.util.Objects;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("높이를 입력하세요 : ");
        int n = sc.nextInt();
        System.out.print("밑변을 입력하세요 : ");
        int m = sc.nextInt();
        System.out.print("방향을 입력하세요 : ");
        String h = sc.next();
        if (Objects.equals(h, "R")) {
            for (int i = n; i >= 1; i--) {
                for (int k = 1; k <= i - 1; k++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= m; j++)
                    System.out.print("*");
                System.out.println("");
            }
        }
        else if (Objects.equals(h, "L")) {
            for (int j = 1; j <= m; j++)
                System.out.print("*");
            System.out.println("");
            for(int i = 1; i <= n-1; i++){
                for (int k = 1; k <= i; k++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= m; j++)
                    System.out.print("*");
                System.out.println("");
            }
        }
    }
}


