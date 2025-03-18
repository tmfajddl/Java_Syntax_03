package org.example;

import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        long sum = Arrays.stream(arr)
                .mapToLong(e -> Long.parseLong(e) )
                .sum();
        System.out.println(sum);
    }
}
