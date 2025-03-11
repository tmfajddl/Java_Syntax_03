package org.example;

import java.awt.*;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        String msg = greet("Jin");
        System.out.println(msg); // Hello, jin! 출력

        Point point = createPoint(5, 10);
        System.out.println("Point create at (" + point.x + ", " + point.y + ")");
        //새로운 객체인 Point(5,10) 생성 후 Point create at (5,10) 출력
        int[] evens = firstNEvenNumbers(5);
        System.out.println("first 5 even numbers : " + Arrays.toString(evens));
        // 정수타입이 5개 들어갈 수 있는  객체 생성하고, evenNumbers 변수에 만들어진 객체의 리모컨을 넘겨줌
        // 배열에 2부터 2씩 증가하록 5번 넣어줌 [2,4,6,8,10]
        // evens에 evenNumbers 대입
        // first 5 even numbers : [2, 4, 6, 8, 10] 출력
    }

    public static String greet(String name) {
        return "Hello, " + name + "!"; // 넘겨받은 name을 이용하여 Hello, name! 반환
    }

    public static Point createPoint(int x, int y) {
        return new Point(x, y); // 새로운 객체인 Point(x,y) 생성

    }

    public static int[] firstNEvenNumbers(int n) {
        int[] evenNumbers = new int[n]; // 정수타입이 n개 들어갈 수 있는  객체 생성
        // 변수에 만들어진 객체의 리모컨을 넘겨줌

        for (int i = 0, num = 2; i < n; i++, num += 2) {
            evenNumbers[i] = num; // 배열에 2부터 2씩 증가하록 n번 넣어줌
        }
        return evenNumbers; //배열 돌려줌
    }
}
