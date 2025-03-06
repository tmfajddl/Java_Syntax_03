package org.example;

import java.util.Objects;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int n = sc.nextInt();
        for(int i = n; i >= 1; i--) {
            for (int j = 1; j <= i - 1; j++)
                System.out.print(" ");
            for (int k = 2*i; k <= 2*n; k++)
                System.out.print("*");
            System.out.println("");
        }
        for(int m = 1; m <= n-1; m++){
            for(int j = 1; j <= m; j++)
                System.out.print(" ");
            for(int k = 2*m; k <= 2*n-2; k++)
                System.out.print("*");
            System.out.println("");
        }
    }
}


