package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        선생님 a = new 선생님();
        System.out.print("기준 년도 입력 : ");
        int year = sc.nextInt();
        System.out.print("나이 입력 : ");
        int age = sc.nextInt();
        System.out.printf("%d년 기준 %d살이므로 %d년생입니다.",year, age, a.출생년도(year,age));


    }
}

class 선생님 {
    public int 출생년도(int year, int age) {
        int answer = year - (age-1);
        return answer;
    }
}