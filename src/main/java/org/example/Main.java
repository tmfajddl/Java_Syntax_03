package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        int len = numbers.length;
        for(int i = 0; i < len; i++) {
            System.out.print("배열에 들어갈 숫자를 입력하세요 : ");
            numbers[i] = sc.nextInt();
        }
        int[] arr = new int[len];
        for(int i = 0; i < len; i++)
            arr[i] = numbers[i] * 2;
        for(int i = 0; i < len; i++)
            System.out.printf("%d ",arr[i]);
    }
}
