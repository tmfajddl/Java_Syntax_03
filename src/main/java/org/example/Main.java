package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A * (B % 10));
        System.out.println(A * (B / 10 % 10));
        System.out.println(A * (B / 100));
        System.out.println(A * B);
    }
}
