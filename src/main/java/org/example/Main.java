package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println(num1 + num2);
        }
    }
}
