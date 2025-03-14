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
        int[] arr = new int[len];
        for(int i = len - 1; i >= 0; i--){
            for(int j = 0; j < len; j++){
                if(i + j == len - 1)
                    arr[j] = num_list[i];
            }
        }
        for(int i = 0; i < len; i++)
            System.out.printf("%d ",arr[i]);
    }
}
