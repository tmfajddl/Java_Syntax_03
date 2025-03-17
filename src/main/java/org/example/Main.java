package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum_price = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            int price = sc.nextInt();
            int num = sc.nextInt();
            sum += price * num;
        }
        if(sum == sum_price)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
