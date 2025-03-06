package org.example;

import java.util.Objects;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("높이를 입력하세요 : ");
        int h = sc.nextInt();
        System.out.print("반복횟수를 입력하세요 : ");
        int r = sc.nextInt();
        for(int i = 1; i <= r; i++){
            for(int j = 1; j <= h; j++){
                for(int n = 1; n < j; n++)
                    System.out.print(" ");
                System.out.println("*");
            }
            for(int m = h-1; m >= 1; m--){
                for(int k = h-m; k <= 1; k++)
                    System.out.print(" ");
                System.out.println("*");
            }
        }
    }
}


