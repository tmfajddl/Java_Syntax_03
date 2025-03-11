package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("전체 학생수 입력 : ");
        int n = sc.nextInt();
        int[] score = new int[n];
        int[] score2 = new int[n];
        for(int i = 0; i < score.length; i++) {
            System.out.printf("%d번째 학생 점수 입력 : ",i+1);
            score[i] = sc.nextInt();
        }
        for(int i = 0; i < score.length; i++) {
            int num = 0;
            for(int j = 0; j < score.length; j++){
                if(score[i] > score[j])
                    num++;
            }
            score2[num] = score[i];
        }
        for(int i = 0; i < score.length; i++)
            System.out.printf("%d ", score2[i]);
        System.out.println("");
        System.out.printf("가장 큰 점수차는 %d점 입니다.",score2[n-1]-score2[0]);
    }
}



