package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요 : ");
        int num = sc.nextInt();
        if(num<0)
            System.out.println("나이를 다시입력해주세요.");
        else if(num<10)
            System.out.println("영유아입니다.");
        else if(num<20)
            System.out.println("10대입니다.");
        else if(num<30)
            System.out.println("20대입니다.");
        else if(num<40)
            System.out.println("30대입니다.");
        else
            System.out.println("40대이상입니다");

        sc.close();
            }
        }