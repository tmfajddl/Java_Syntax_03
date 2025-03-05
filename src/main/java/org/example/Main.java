package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하시오 : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int k = 1; k <= (n-i); k++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
