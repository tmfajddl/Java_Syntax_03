package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 3;
        for(int b = 1; b <= n; b++){
            System.out.print("*");
        }
        System.out.println("");
        if((n-2) % 3 == 0) {
            for (int a = 1; a <= n / k; a++) {
                System.out.print("*");
                for (int i = 2; i <= n - 1; i++) {
                    if (i % k == 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println("*");
                System.out.print("*");
                for (int j = 2; j <= n - 1; j++) {
                    if (j % k == 2)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println("*");
                System.out.print("*");
                for (int l = 2; l <= n - 1; l++) {
                    if (l % k == 0)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println("*");
            }
        }
        else if((n-2) % 3 == 1) {
            for (int a = 1; a <= n / k; a++) {
                System.out.print("*");
                for (int i = 2; i <= n - 1; i++) {
                    if (i % k == 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println("*");
                System.out.print("*");
                for (int j = 2; j <= n - 1; j++) {
                    if (j % k == 2)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println("*");
                System.out.print("*");
                for (int l = 2; l <= n - 1; l++) {
                    if (l % k == 0)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println("*");
            }
            System.out.print("*");
            for (int i = 2; i <= n - 1; i++) {
                if (i % k == 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("*");
        }
        else{
            for (int a = 1; a <= (n-2) / k; a++) {
                System.out.print("*");
                for (int i = 2; i <= n - 1; i++) {
                    if (i % k == 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println("*");
                System.out.print("*");
                for (int j = 2; j <= n - 1; j++) {
                    if (j % k == 2)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println("*");
                System.out.print("*");
                for (int l = 2; l <= n - 1; l++) {
                    if (l % k == 0)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println("*");

            }
            System.out.print("*");
            for (int i = 2; i <= n - 1; i++) {
                if (i % k == 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("*");
            System.out.print("*");
            for (int j = 2; j <= n - 1; j++) {
                if (j % k == 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("*");
        }

        for(int c = 1; c <= n; c++) {
            System.out.print("*");
        }

    }
}
