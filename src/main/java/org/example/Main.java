package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int 결과1 = Math.nToMSum(2, 3);
        System.out.println("결과1 : " + 결과1);
        // 출력 : 결과1 : 5

        int 결과2 = Math.nToMSum(5, 10);
        System.out.println("결과2 : " + 결과2);
        // 출력 : 결과2 : 45
    }
}

class Math {
    static int nToMSum(int n,int m) {
        int sum = 0;
        for (int i = n; i <= m; i++)
            sum += i;
        return sum;
    }
}
