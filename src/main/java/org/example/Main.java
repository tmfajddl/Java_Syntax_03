package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 : ");
        int n = sc.nextInt();
        System.out.println("**");
        for(int i = 1; i <= n-1; i++){
            for(int j = 1; j <= i; j++)
                System.out.print(" ");
            System.out.println("**");
        }
    }
}

