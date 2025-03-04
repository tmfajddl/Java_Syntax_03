package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("월을 입력하세요 : ");
        int mon = sc.nextInt();
        if(mon<0)
            System.out.println("월이 잘못 입력되었습니다.");
        else if(mon <3)
            System.out.println("겨울입니다.");
        else if(mon<6)
            System.out.println("봄입니다.");
        else if(mon<9)
            System.out.println("여름입니다.");
        else if(mon<10)
            System.out.println("가을입니다.");
        else if(mon<=12)
            System.out.println("겨울입니다.");
        else
            System.out.println("월이 잘못 입력되었습니다.");
    }
}