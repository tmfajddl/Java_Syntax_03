package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어점수 : ");
        int sco1 = sc.nextInt();
        System.out.print("수학점수 : ");
        int sco2 = sc.nextInt();
        System.out.print("영어점수 : ");
        int sco3 = sc.nextInt();
        double avg = (sco1 + sco2 + sco3)/3;
        if(sco1 >= 40 && sco2 >= 40 && sco3 >= 40) {
            if (avg >= 60) {
                System.out.println("국어 : " + sco1);
                System.out.println("수학 : " + sco2);
                System.out.println("영어 : " + sco3);
                System.out.println("평균 : " + avg);
                System.out.println("축하합니다, 합격입니다!");
            }
        }
        else
            System.out.println("불합격입니다.");
    }
}