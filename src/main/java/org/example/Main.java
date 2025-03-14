package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num_list = new int[5];
        int len = num_list.length;
        for(int i = 0; i < len; i++) {
            System.out.print("배열에 들어갈 숫자를 입력하세요 : ");
            num_list[i] = sc.nextInt();
        }
        System.out.print("인덱스 시작번호: ");
        int num1 = sc.nextInt();
        System.out.print("인덱스 끝번호: ");
        int num2 = sc.nextInt();
        int size = num2-num1+1;
        int[] arr = new int[size];
        int j = 0;
        for(int i = num1; i <= num2; i++) {
            arr[j] = num_list[i];
            j++;
        }
        for(int i = 0; i < size; i++)
            System.out.printf("%d ",arr[i]);
    }
}
