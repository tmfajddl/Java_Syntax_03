package org.example;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution a = new Solution();
        System.out.print("기준 년도 입력 : ");
        int year = sc.nextInt();
        System.out.print("나이 입력 : ");
        int age = sc.nextInt();
        System.out.printf("%d년 기준 %d살이므로 %d년생입니다.",year, age, a.solution(age));


    }
}

class Solution {
    public int solution(int age) {
        int answer = 2022 - (age-1);
        return answer;
    }
}